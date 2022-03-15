package basics.interfaces;

public class ImplementClassFromTwoInterfaces implements SuperInterface1, SuperInterface2 {
    @Override
    public void methodFromInterface1() {
        System.out.println("This is methodFromInterface1");
    }

    @Override
    public void methodFromInterface2() {
        System.out.println("This is methodFromInterface2");
    }
}
