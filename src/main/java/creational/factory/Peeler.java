package creational.factory;

public class Peeler implements SharpObject {
    @Override
    public void makeSharpObject() {
        System.out.println("I just made a Peeler");
    }
}
