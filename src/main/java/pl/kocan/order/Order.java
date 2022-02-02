package pl.kocan.order;

import lombok.RequiredArgsConstructor;
import lombok.Value;

@Value
@RequiredArgsConstructor
public class Order {

    Long orderNumber;
    OrderStatus orderStatus;

}
