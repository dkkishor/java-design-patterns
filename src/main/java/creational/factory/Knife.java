package creational.factory;

public class Knife implements SharpObject {

    @Override
    public void makeSharpObject() {
        System.out.println("I just made Knife");
    }
}
