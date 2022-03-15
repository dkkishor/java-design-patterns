package structural.Adapter;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdapterMakePaymentTest {

    @Test
    public void testMakePayment() {
        Venmo venmo = new VenmoSystem();
        AdapterMakePayment adapter = new AdapterMakePayment(venmo);
        adapter.payment = 540.00;

        adapter.makePayment(1234);
    }
}