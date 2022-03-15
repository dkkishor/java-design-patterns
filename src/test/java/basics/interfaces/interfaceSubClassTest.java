package basics.interfaces;

import org.junit.Test;

public class interfaceSubClassTest {
    @Test
    public void testInterfaceSubClass() {
        ImplementSubInterfaceFromTwoInterfaces subObj = new ImplementSubInterfaceFromTwoInterfaces();
        subObj.methodFromInterface1();
        subObj.methodFromInterface2();
        subObj.methodFromSubInterfaceFromTwoInterfaces();

        //Default interface method test
        subObj.iAmDefaultAddedLater();
    }
}
