package WorldApp;
import java.util.List;

public interface WorldAppInterface {
public Country getCountry(int id);
public List<Country> getAllCountries();
public List<City> getAllCities();
public void updateCountry(int CountryId, int Population);
}