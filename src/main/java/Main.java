import pl.kocan.notification.Email;
import pl.kocan.notification.MobileApp;
import pl.kocan.notification.TextMessage;
import pl.kocan.order.Order;
import pl.kocan.order.OrderStatus;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifyObservers();

        System.out.println("---------------------------------------");
        order.changeOrderStatus(OrderStatus.WYSŁANE);
        System.out.println("---------------------------------------");
        order.unregisterObserver(email);
        order.changeOrderStatus(OrderStatus.ODEBRANE);

    }

}
