package basics.inheritance;

import org.junit.Test;

public class castingTest {

    @Test
    public void testCasting() {
        SuperClass subObj = new SubClass();
        // Can Access super class methods
        subObj.methodSuper();

        // Cannot access sub class methods
        //subObj.methodSub();

        // Casting helps here to access sub-class methods
        ((SubClass) subObj).methodSub();
        // WAIT: I can also access superclass methods
        ((SubClass) subObj).methodSuper();
    }
}
