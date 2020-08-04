package WorldApp;
import java.util.Scanner;
public class MainClass {
    public static void main(String[] args) {
        CountryDriver CountryDAO = new CountryDriver();
        // print all countries
        for (Country c : CountryDAO.getAllCountries()) {
            System.out.println("Country Id : " + c.getCountryId() + ", Country name : " + c.getCountryName()
                    + ", Population : " + c.getPopulation() + ", City Id : " + c.getCityId());
        }
        System.out.println();
        CountryDriver CityDAO = new CountryDriver();
        // print all cities
        for (City e : CityDAO.getAllCities()) {
            System.out.println("City Id : " + e.getCityId() + ", City name : " + e.getCityName());
        }
        System.out.println();
        // Update population
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Country ID");
        int id = sc.nextInt();
        System.out.println("Please Enter a number to update your population");
        int population = sc.nextInt();
        CountryDAO.updateCountry(id, population);
        
        
    
        // print all countries
        for (Country c : CountryDAO.getAllCountries()) {
            System.out.println("Country Id : " + c.getCountryId() + ", Country name : " + c.getCountryName()
                    + ", Population : " + c.getPopulation() + ", City Id : " + c.getCityId());
        }
        System.out.println();
    
        // print all cities
        for (City e : CityDAO.getAllCities()) {
            System.out.println("City Id : " + e.getCityId() + ", City name : " + e.getCityName());
        }
        System.out.println();
        
        
    }
}