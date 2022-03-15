package basics.reflection;

public class DepartmentReflection {
    public int deptNo;
    public String deptName;

    public String toString() {
        if (this instanceof ComputerScienceDept) {
            return "ComputerScienceDept phoneNumber is: " + ((ComputerScienceDept) this).phoneNumber;
        }

        if (this instanceof ElectronicsDept) {
            return "ElectronicsDept email is: " + ((ElectronicsDept) this).email;
        }

        return "";
    }
}
