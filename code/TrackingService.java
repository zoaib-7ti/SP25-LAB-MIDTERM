import java.util.ArrayList;
import java.util.List;

public class TrackingService {

    private static TrackingService instance;

    private List<Observer> observers = new ArrayList<>();

    private TrackingService() {
    }

    public static TrackingService getInstance() {

        if (instance == null) {
            instance = new TrackingService();
        }
        return instance;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void sendLiveUpdate() {
        notifyObservers("Car is on the way to the destination.");
    }
}