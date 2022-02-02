package pl.kocan.notification;

import pl.kocan.order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order) {
        System.out.println("Aplikacja mobilna - zamowienie numer: " + order.getOrderNumber() + " zmieniło status na: " + order.getOrderStatus());
    }

}
