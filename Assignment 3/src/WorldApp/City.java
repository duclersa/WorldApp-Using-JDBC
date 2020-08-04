package WorldApp;

public class City {
	private int CityId;
	private String CityName;
	public City() {
	}
	public City(String CityName, int CityId) {
		this.CityId = CityId;
		this.CityName = CityName;
	} 
	public int getCityId() {
		return CityId;
	}
	public void setCityId(int cityId) {
		CityId = cityId;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
}