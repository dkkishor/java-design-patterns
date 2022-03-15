package basics.constructor;

public class EmployeeNoConstructor {
    private int empID;
    private String empName;

    // There is no constructor - Hence uses default constructor

    @Override
    public String toString() {
        return "EmployeeNoConstructor: empID=" + empID + ", empName=" + empName;
    }
}
