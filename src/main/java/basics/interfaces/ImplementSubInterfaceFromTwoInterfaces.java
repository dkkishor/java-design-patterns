package basics.interfaces;

public class ImplementSubInterfaceFromTwoInterfaces implements SubInterfaceFromTwoInterfaces {

    @Override
    public void methodFromSubInterfaceFromTwoInterfaces() {
        System.out.println("I am methodFromSubInterfaceFromTwoInterfaces in ImplementSubInterfaceFromTwoInterfaces");
    }

    @Override
    public void methodFromInterface1() {
        System.out.println("I am methodFromInterface1 in ImplementSubInterfaceFromTwoInterfaces");
    }

    @Override
    public void methodFromInterface2() {
        System.out.println("I am methodFromInterface2 in ImplementSubInterfaceFromTwoInterfaces");
    }
}
