package pl.kocan.notification;

import pl.kocan.order.Order;

public class TextMessage {

    public void updateOrderStatus(Order order) {
        System.out.println("SMS - zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
