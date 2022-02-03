package pl.kocan.notification;

import pl.kocan.order.Order;

public interface Observer {

    void update(Order order);

}
