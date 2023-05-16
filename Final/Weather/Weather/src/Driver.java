import java.util.*;

public class Driver {
    public static void main(String[] args) {
        WeatherForecastSystem weatherForecastSystem = new WeatherForecastSystem();

        // Set the weather services
        WeatherService weatherAPIService = new WeatherAPIService();
        WeatherService weatherGovService = new WeatherGovService();
        WeatherService openMeteoService = new OpenMeteoService();

        weatherForecastSystem.setWeatherService(weatherAPIService);
        weatherForecastSystem.setWeatherService(weatherGovService);
        weatherForecastSystem.setWeatherService(openMeteoService);

        WeatherSubscriber weatherSubscriber = new WeatherSubscriber();
        // Get the weather subject
        WeatherSubject weatherSubject = weatherForecastSystem.getWeatherSubject();

        // Register the observer with the weather subject
        weatherSubject.registerObserver(weatherSubscriber);


        // Call the weather services and track the number of notifications
        int weatherGovNotifications = 0;
        int weatherAPINotifications = 0;
        int openMeteoNotifications = 0;

        // Call WeatherGovService
        WeatherData weatherGovData = weatherGovService.getWeather();
        weatherForecastSystem.updateWeatherData(weatherGovData);
        weatherGovNotifications++;

        // Call WeatherAPIService twice
        WeatherData weatherAPIData1 = weatherAPIService.getWeather();
        weatherForecastSystem.updateWeatherData(weatherAPIData1);
        weatherAPINotifications++;

        WeatherData weatherAPIData2 = weatherAPIService.getWeather();
        weatherForecastSystem.updateWeatherData(weatherAPIData2);
        weatherAPINotifications++;

        // Call OpenMeteoService multiple times
        for (int i = 0; i < 17; i++) {
            WeatherData openMeteoData = openMeteoService.getWeather();
            weatherForecastSystem.updateWeatherData(openMeteoData);
            openMeteoNotifications++;
        }

        // Print the number of notifications from each weather service
        System.out.println(weatherGovNotifications + " notifications from WeatherGov");
        System.out.println(weatherAPINotifications + " notifications from WeatherAPI");
        System.out.println(openMeteoNotifications + " notifications from OpenMeteo");

        // Print the weather data of the latest notification
        //WeatherData latestWeatherData = weatherSubscriber.notify(latestWeatherData);
        // weatherSubscriber.notify():
        WeatherData latestWeatherData = new WeatherData();
        // System.out.println("Latest weather data:");
        // System.out.println("Temperature: " + latestWeatherData.getTemperature());
        // System.out.println("Humidity: " + latestWeatherData.getHumidity());
        // System.out.println("Pressure: " + latestWeatherData.getPressure());
        // System.out.println("Wind Speed: " + latestWeatherData.getWindSpeed());

         // Update the weather data
         weatherForecastSystem.updateWeatherData(latestWeatherData);

         // Retrieve the observers from the weather subject
         List<WeatherObserver> observers = weatherSubject.getWeatherObservers();
 
         // Display the notifications and weather data
         for (WeatherObserver observer : observers) {
             WeatherSubscriber subscriber = (WeatherSubscriber) observer;
             System.out.println(subscriber.getNotification());
             System.out.println("Weather Data:");
             WeatherData weatherData = subscriber.getLatestWeatherData();
             System.out.println("Temperature: " + weatherData.getTemperature());
             System.out.println("Humidity: " + weatherData.getHumidity());
             System.out.println("Pressure: " + weatherData.getPressure());
             System.out.println("Wind Speed: " + weatherData.getWindSpeed());
             System.out.println();
        }
    }
}
