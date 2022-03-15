package behavioral.template;

public class OnlineOrders extends AbstractOrders {
    public void validateCart() {
        System.out.println("Validating Online Cart");
    }

    public void createOrder() {
        System.out.println("Creating Online Order");
    }
}
