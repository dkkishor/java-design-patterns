package structural.Adapter;

// Adapter class interacts with 2 different independent systems and makes connection
public class AdapterMakePayment implements Customer {
    Venmo venmo;
    public double payment;
    private String url = "http://my.website.com";

    // Constructor to make sure Venmo interface is implemented
    AdapterMakePayment(Venmo venmo) {
        this.venmo = venmo;
    }

    @Override
    public void makePayment(int customerID) {
        venmo.makePayment(customerID, payment, url);
    }
}
