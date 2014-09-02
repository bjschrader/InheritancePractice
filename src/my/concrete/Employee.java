package my.concrete;

/**
 *
 * @author schra_000
 */
public class Employee {

    private int empNum;
    private String empName, firstName, lastName;

    

    public Employee() {

    }

    public Employee(int empNum, String empName) {

    }
public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public double getWage() {
        return 0; //return 0 because this method is not to be used
    }

    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

}
