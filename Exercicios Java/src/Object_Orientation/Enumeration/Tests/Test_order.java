package Object_Orientation.Enumeration.Tests;

import Object_Orientation.Enumeration.Entities_enums.OrderStatus;
import Object_Orientation.Enumeration.entities.Order;

import java.util.Date;

public class Test_order {
    static void main() {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);

    }
}
