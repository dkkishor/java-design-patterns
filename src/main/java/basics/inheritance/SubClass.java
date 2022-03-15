package basics.inheritance;

public class SubClass extends SuperClass {
    @Override
    public void method() {
        System.out.println("Subclass Method");
    }

    public void methodSub() {
        System.out.println("SubClass Only Method");
    }
}
