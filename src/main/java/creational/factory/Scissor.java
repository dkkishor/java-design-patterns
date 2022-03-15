package creational.factory;

public class Scissor implements SharpObject {
    @Override
    public void makeSharpObject() {
        System.out.println("I just made a Scissor");
    }
}
