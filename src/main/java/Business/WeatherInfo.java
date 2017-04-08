package Business;

/**
 * Created by MS030628 on 4/8/2017.
 */
public interface WeatherInfo extends CoordinatesInfo {
    String GetWeatherByLocation(String location_name);
    String GetWeatherByCoordinates(CoordinatesInfo obj);
}
