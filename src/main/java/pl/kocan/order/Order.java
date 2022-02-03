package pl.kocan.order;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import pl.kocan.notification.Observer;

import java.util.HashSet;
import java.util.Set;

@Data
@RequiredArgsConstructor
public class Order implements Observable {

    Long orderNumber;
    OrderStatus orderStatus;
    Set<Observer> registeredObservers = new HashSet<>();

    public Order(long num, OrderStatus status) {
        this.orderNumber = num;
        this.orderStatus = status;
    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers) {
            observer.update(this);
        }
    }

    public void changeOrderStatus(OrderStatus status) {
        this.orderStatus = status;
        notifyObservers();
    }

}
