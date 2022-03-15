package basics.constructor;

import basics.reflection.DepartmentReflection;

public class Employee {
    private int empID;
    private String empName;
    public Email email;

    // One cannot create employee object without these default values
    Employee(int empID, String empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public void notifyEmployee() {
        email.sendEmail();
    }

    @Override
    public String toString() {
        return "Employee: empID=" + empID + ", empName=" + empName;
    }
}
