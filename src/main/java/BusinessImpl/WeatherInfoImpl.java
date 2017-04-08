package BusinessImpl;
import Business.CoordinatesInfo;
import Business.WeatherInfo;
/**
 * Created by MS030628 on 4/8/2017.
 */
public class WeatherInfoImpl implements WeatherInfo {
    public String GetWeatherByLocation(String location_name)
    {
        String REST_URL = RestConstants.REST_URI.concat(location_name);
        return null;
    }

    public String GetWeatherByCoordinates(CoordinatesInfo obj) {
        return null;
    }
}
