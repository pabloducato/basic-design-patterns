package pl.kocan.notification;

import pl.kocan.order.Order;

public class Email implements Observer {

    public void update(Order order) {
        System.out.println("Email - zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
