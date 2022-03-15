package behavioral.template;

public class StoreOrders extends AbstractOrders {
    public void validateCart() {
        System.out.println("Validating Store Cart items for Recall information");
    }

    public void createOrder() {
        System.out.println("Creating store order");
    }
}
