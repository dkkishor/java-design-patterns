package basics.constructor;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeConstructorTest {
    @Test
    public void testEmployeeWithConstructor() {
        Employee empCon = new Employee(1, "Kishore D");
        System.out.println(empCon);
    }

    @Test
    public void testEmployeeWithNoConstructor() {
        EmployeeNoConstructor empNoCon = new EmployeeNoConstructor();
        System.out.println(empNoCon);
    }

    /* Email class doesn't have any implementers.
       Hence NullPointer Exception is thrown.
     */
    @Test
    public void testEmployeeEmailNullPointer() {
        Employee empNullPointer = new Employee(2, "NULL POINTER");
        boolean nullPointer = false;
        try {
            empNullPointer.notifyEmployee();
        } catch (NullPointerException e) {
            nullPointer = true;
        }

        System.out.println("Testing: " + empNullPointer);
        Assert.assertTrue(nullPointer);
    }
}
