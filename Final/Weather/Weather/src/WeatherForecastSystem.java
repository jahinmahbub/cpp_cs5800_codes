import java.util.*;

public class WeatherForecastSystem {
    private WeatherService weatherService;
    private WeatherData weatherData;
    private WeatherSubject weatherSubject;

    public WeatherForecastSystem() {
        
        this.weatherData = new WeatherData();
        this.weatherSubject = new WeatherSubject();
    }

    public void setWeatherService(WeatherService service) {
        this.weatherService = service;
    }

    public WeatherService getWeatherService(){
        return weatherService;
    }

    public void updateWeatherData(WeatherData weatherGovData) {
        weatherData = weatherService.getWeather();
        weatherSubject.notifyObservers(weatherData);
    }

    public WeatherSubject getWeatherSubject(){
        return weatherSubject;
    }

}
