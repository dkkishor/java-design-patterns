package basics.reflection;

import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentReflectionTest {
    @Test
    public void testDepartmentReflection() {
        DepartmentReflection csDept = new ComputerScienceDept();
        System.out.println(csDept);

        DepartmentReflection eceDept = new ElectronicsDept();
        System.out.println(eceDept);
    }
}