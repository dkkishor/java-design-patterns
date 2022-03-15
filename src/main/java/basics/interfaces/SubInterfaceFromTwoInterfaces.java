package basics.interfaces;

public interface SubInterfaceFromTwoInterfaces extends SuperInterface1, SuperInterface2{
    // Java 8 (or later) introduced default interface methods
    default void iAmDefaultAddedLater() {
        System.out.println("iAmDefaultAddedLater in SubInterfaceFromTwoInterfaces");
    }

    void methodFromSubInterfaceFromTwoInterfaces();
}
