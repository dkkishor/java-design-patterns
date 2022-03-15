package behavioral.template;

public abstract class AbstractOrders {
    public void completeOrder() {
        // These tasks need to be executed in a certain order
        // Hence, the methods are abstract so we can define the order.
        // Implementation of methods will be in a separate class.
        // Abstract methods can only be in an Abstract class
        validateCart();
        createOrder();
        updateDB();
        postOrderCompleteNotification();
    }

    abstract void validateCart();
    abstract void createOrder();
    public void updateDB() {
        System.out.println("Updating Database from AbstractOrders");
    }
    public void postOrderCompleteNotification() {
        System.out.println("Showing/Printing Order Completion Details from AbstractOrders");
    }
}
