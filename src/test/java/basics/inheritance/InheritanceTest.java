package basics.inheritance;

import org.junit.Test;

public class InheritanceTest {
    @Test
    public void testInheritance() {
        // Objects of respective classes
        SuperClass sup = new SuperClass();
        SubClass sub = new SubClass();

        // Object of SubClass to SuperClass property
        SuperClass subObj = new SubClass();
        System.out.println("I am " + subObj.getClass());
        subObj.method();

        // OOPS - Compilation Error
        // SubClass superObj = new SuperClass();
    }
}
