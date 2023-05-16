import java.util.*;

public class WeatherSubject {
    private List<WeatherObserver> observers;

    public WeatherSubject() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(WeatherObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(WeatherObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(WeatherData weatherData) {
        for (WeatherObserver observer : observers) {
            observer.notify(weatherData);
        }
    }

    public List<WeatherObserver> getWeatherObservers(){
        return observers; 
    }
}
