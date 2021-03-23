package environment.status.env.controllers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import environment.status.env.dataClasses.AirQuality;
import environment.status.env.dataClasses.Station;
import environment.status.env.dataClasses.StationsDetails;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class restController {

	private final static String URL_FIND_ALL = "http://api.gios.gov.pl/pjp-api/rest/station/findAll";
	private final static String URL_FIND_SINGLE = "http://api.gios.gov.pl/pjp-api/rest/station/sensors/{id}";
	private final static String URL_FIND_DETAILS = "http://api.gios.gov.pl/pjp-api/rest/data/getData/";
	private final static String URL_FIND_AIR_QUALITY = "http://api.gios.gov.pl/pjp-api/rest/aqindex/getIndex/{stationId}";
	
	private RestTemplate restTemplate = new RestTemplate();
	
	
	@ApiOperation(value = "Find all stations" , notes = "Retrieve all air-quality stations in Poland.")
	@GetMapping("/stations")
	public ResponseEntity<Station[]> getAllStations()
	{
		return callMethodRestTemplate(URL_FIND_ALL, Station[].class);
		
	}
	
	
	@ApiOperation(value = "Find station by given id" , notes = "Retrieve only one station, depending on given ID.")
	@GetMapping("/stations/{id}")
	public ResponseEntity<Station> getStationById(@ApiParam(value = "uniqe ID of station" , example = "123")@PathVariable("id") int id)
	{
		return callMethodRestTemplate(URL_FIND_SINGLE, Station.class, id);
	}

	
	@ApiOperation(value = "Find all stations by city" , notes = "Retrieve all stations belong to given city.")
	@GetMapping("/station")
	public List<Station> getStationsByCity(@ApiParam(value = "city with polish keywords" , example = "Wrocław")@RequestParam String city)
	{
		return callMethodGetStationsByCity(city);
	}
	
	
	
	@ApiOperation(value = "Find all data of measure air-quality by city" , notes = "Retrieve all details of measure devices belong to given city.")
	@GetMapping("/stations/air-quality")
	public List<AirQuality> getAirQualityOfStationsByCity(@ApiParam(value = "city with polish keywords" , example = "Wrocław")@RequestParam String city)
	{
		return callMethodGetAirQualityOfStationsByCity(city);
	}
	
	
	@ApiOperation(value = "Get simple format of view" , notes = "Retrieve simple format of air quality by given city. This method join data from tables: AirQuality, Station | and create simple, most important view of data.")
	@GetMapping("/stations/simple-details")
	public List<StationsDetails> getSimpleStationsDetailsByCity(@ApiParam(value = "city with polish keywords" , example = "Wrocław")@RequestParam String city)
	{
		return callMethodGetSimpleStationsDetailsByCity(city);
	}
	
	
	
	
	
	
	
	// ============================== M E T H O D S ============================== 
	
	
	
	
	private <T> ResponseEntity<T> callMethodRestTemplate(String url, Class<T> responseType, Object... objects)
	{
		ResponseEntity<T> response = restTemplate.getForEntity(url, responseType, objects);
		return response;
	}
	
	
	
	private List<Station> callMethodGetStationsByCity(String city)
	{
		ResponseEntity<Station[]> response = restTemplate.getForEntity(URL_FIND_ALL, Station[].class);
		
		return Arrays.asList(response.getBody())
				.stream()
				.filter(element -> element.getCity().getName().toLowerCase().equals(city.toLowerCase()))
				.collect(Collectors.toList());
	}

	
	
	private List<AirQuality> callMethodGetAirQualityOfStationsByCity(String city)
	{
		List<AirQuality> airQualityList = new ArrayList<AirQuality>();
		
		for(Station p : callMethodGetStationsByCity(city))
		{
			airQualityList.add(restTemplate.getForEntity(URL_FIND_AIR_QUALITY, AirQuality.class, p.getId()).getBody());
		}
		
		return airQualityList;
	}
	
	
	private AirQuality callMethodGetAirQualityById(int id)
	{
		return restTemplate.getForEntity(URL_FIND_AIR_QUALITY, AirQuality.class, id).getBody();
	}
	
	
	private List<StationsDetails> callMethodGetSimpleStationsDetailsByCity(String city)
	{
		
		List<StationsDetails> stationsDetailsList = new ArrayList<StationsDetails>();
		for(Station p : callMethodGetStationsByCity(city))
		{
			stationsDetailsList.add(new StationsDetails(p.getId(),
														p.getCity().getName(),
														p.getGegrLat(),
														p.getGegrLon(),
														p.getAddressStreet(),
														callMethodGetAirQualityById(p.getId()).getStIndexLevel().getIndexLevelName()));
		}
		
		return stationsDetailsList;
	}
	
}
