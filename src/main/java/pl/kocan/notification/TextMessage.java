package pl.kocan.notification;

import pl.kocan.order.Order;

public class TextMessage implements Observer {

    public void update(Order order) {
        System.out.println("SMS - zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
