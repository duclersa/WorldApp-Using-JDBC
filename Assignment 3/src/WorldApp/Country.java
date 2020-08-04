package WorldApp;

public class Country {
	private int CountryId;
	private String CountryName;
	private int Population;
	private int CityId;
	public Country() {
	}
	public Country(int CountryId, String CountryName, int Population, int CityId) {
		this.CountryId = CountryId;
		this.CountryName = CountryName;
		this.Population = Population;
		this.CityId = CityId;
	}
	public int getCountryId() {
		return CountryId;
	}
	public void setCountryId(int countryId) {
		CountryId = countryId;
	}
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public int getPopulation() {
		return Population;
	}
	public void setPopulation(int population) {
		Population = population;
	}
	public int getCityId() {
		return CityId;
	}
	public void setCityId(int cityId) {
		CityId = cityId;
	}
}