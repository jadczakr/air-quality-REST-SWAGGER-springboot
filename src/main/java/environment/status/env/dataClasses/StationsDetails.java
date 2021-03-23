package environment.status.env.dataClasses;

public class StationsDetails {

	
	private int stationId;
	private String city;
	private float gegrLat;
	private float gegrLon;
	private String addressStreet;
	private String airQualityStatus;
	
	public StationsDetails(){}
	
	
	public StationsDetails(int stationId, String city, float gegrLat, float gegrLon, String addressStreet,
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


	public float getGegrLat() {
		return gegrLat;
	}


	public void setGegrLat(float gegrLat) {
		this.gegrLat = gegrLat;
	}


	public float getGegrLon() {
		return gegrLon;
	}


	public void setGegrLon(float gegrLon) {
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
