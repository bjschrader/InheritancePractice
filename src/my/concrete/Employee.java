package my.concrete;

/**
 *
 * @author schra_000
 */
public class Employee {

    private int empNum;
    private String firstName, lastName;
    


    public Employee() {

    }

    public Employee(int empNum, String firstName, String lastName) {

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
    
    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    

}
