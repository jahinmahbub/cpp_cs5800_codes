public class WeatherSubscriber implements WeatherObserver {
    private WeatherData latestWeatherData;
    private String notification;

    public void notify(WeatherData weatherData) {
        this.latestWeatherData = weatherData;
        this.notification = "New weather data received";
    }

    public WeatherData getLatestWeatherData() {
        return latestWeatherData;
    }

    public String getNotification() {
        return notification;
    }
}