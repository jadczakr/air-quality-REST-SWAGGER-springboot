package environment.status.env.dataClasses;

public class StationsDetails {

	
	private int stationId;
	private String city;
	private String gegrLat;
	private String gegrLon;
	private String addressStreet;
	private String airQualityStatus;
	
	public StationsDetails(){}
	
	
	public StationsDetails(int stationId, String city, String gegrLat, String gegrLon, String addressStreet,
			String airQualityStatus) {
		super();
		this.stationId = stationId;
		this.city = city;
		this.gegrLat = gegrLat;
		this.gegrLon = gegrLon;
		this.addressStreet = addressStreet;
		this.airQualityStatus = airQualityStatus;
	}


	public int getStationId() {
		return stationId;
	}


	public void setStationId(int stationId) {
		this.stationId = stationId;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getGegrLat() {
		return gegrLat;
	}


	public void setGegrLat(String gegrLat) {
		this.gegrLat = gegrLat;
	}


	public String getGegrLon() {
		return gegrLon;
	}


	public void setGegrLon(String gegrLon) {
		this.gegrLon = gegrLon;
	}


	public String getAddressStreet() {
		return addressStreet;
	}


	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}


	public String getAirQualityStatus() {
		return airQualityStatus;
	}


	public void setAirQualityStatus(String airQualityStatus) {
		this.airQualityStatus = airQualityStatus;
	}


	@Override
	public String toString() {
		return "StationsDetails [stationId=" + stationId + ", city=" + city + ", gegrLat=" + gegrLat + ", gegrLon="
				+ gegrLon + ", addressStreet=" + addressStreet + ", airQualityStatus=" + airQualityStatus + "]";
	}
	
	
	
}
