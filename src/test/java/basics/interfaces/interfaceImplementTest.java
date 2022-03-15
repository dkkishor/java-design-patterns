package basics.interfaces;

import org.junit.Test;

public class interfaceImplementTest {

    @Test
    public void testInterfaceImplement() {
        ImplementClassFromTwoInterfaces subObj = new ImplementClassFromTwoInterfaces();
        subObj.methodFromInterface1();
        subObj.methodFromInterface2();
    }
}
