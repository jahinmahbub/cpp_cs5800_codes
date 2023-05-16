import java.util.*;

public class TweetSubject {
    private List<TweetObserver> observers;
    
    public TweetSubject() {
        this.observers = new ArrayList<TweetObserver>();
    }
    
    public void registerObserver(TweetObserver observer) {
        this.observers.add(observer);
    }
    
    public void removeObserver(TweetObserver observer) {
        this.observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (TweetObserver observer : this.observers) {
            observer.notify();
        }
    }
}
