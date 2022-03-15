package structural.Adapter;

public class VenmoSystem implements Venmo {
    @Override
    public void makePayment(int customerID, double payment, String url) {
        System.out.println("Payment made for customer: " + customerID + ", paid: " + payment + ", from URL: " + url);
    }
}
