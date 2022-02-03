package pl.kocan.order;

import pl.kocan.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();

}
