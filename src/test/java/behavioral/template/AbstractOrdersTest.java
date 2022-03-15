package behavioral.template;

import org.junit.Test;

import static org.junit.Assert.*;

public class AbstractOrdersTest {

    @Test
    public void testCompleteOrders() {
        OnlineOrders onlineOrder = new OnlineOrders();
        onlineOrder.completeOrder();

        StoreOrders storeOrder = new StoreOrders();
        storeOrder.completeOrder();
    }
}