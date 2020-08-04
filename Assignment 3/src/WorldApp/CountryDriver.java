package WorldApp;
import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
//import com.collabera.jump.DAOExample.ConnectionFactory;
//import com.collabera.jump.DAOExample.Student;
public class CountryDriver implements WorldAppInterface {
    List<Country> countryList;
    List<City> cityList;
    public CountryDriver() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public Country getCountry(int id) {
        // TODO Auto-generated method stub
        return null;
    }
    @Override
    public List<Country> getAllCountries() {
        Connection con = ConnectionFactory.getConnection();
        try {
            Statement stmt = con.createStatement();
            // ResultSet rs = stmt.executeQuery("select * from Country inner join City \r\n"
            // +
            // "on Country.CityId = City.CityId;");
            ResultSet rs = stmt.executeQuery("select * from Country");
            List<Country> countryList = new ArrayList<Country>();
            while (rs.next()) {
                Country s = new Country();
                s.setCountryId(rs.getInt("CountryId"));
                s.setCountryName(rs.getString("CountryName"));
                s.setPopulation(rs.getInt("Population"));
                s.setCityId(rs.getInt("CityId"));
                countryList.add(s);
            }
            return countryList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    // UPDATE MOD
    @Override
    public void updateCountry(int CountryId, int Population) {
        Connection con = ConnectionFactory.getConnection();
    
        try {
            Statement stmt = con.createStatement();
            int row = stmt.executeUpdate(
                    "update Country" + " set Population = " + Population + " where Countryid = " + CountryId);
            List<Country> countryList = new ArrayList<Country>();
//              Country s = new Country();
//              s.setCountryId(rs.getInt("CountryId"));
//              s.setPopulation(rs.getInt("Population"));
//              countryList.add(s);
            
            // return cityList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            
    }
    @Override
    public List<City> getAllCities() {
        Connection con = ConnectionFactory.getConnection();
        try {
            Statement stmt = con.createStatement();
            // ResultSet rs = stmt.executeQuery("select * from Country inner join City \r\n"
            // +
            // "on Country.CityId = City.CityId;");
            ResultSet rs = stmt.executeQuery("select * from City");
            List<City> cityList = new ArrayList<City>();
            while (rs.next()) {
                City s = new City();
                s.setCityId(rs.getInt("CityId"));
                s.setCityName(rs.getString("CityName"));
                cityList.add(s);
            }
            return cityList;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}