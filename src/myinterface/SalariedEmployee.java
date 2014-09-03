package myinterface;
/**
 *
 * @author schra_000
 */
public class SalariedEmployee implements Employee {
    
    private double salary;
    private String empName;
    private int empNum;
    private String lastName;
    private String firstName;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
//    @Override
//    public double getWage() {
//        return salary;
//    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        //return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        //return lastName;
    }

    @Override
    public int getEmpNum() {
        return empNum;
    }

    @Override
    public void setEmpNum(int empNum) {
        //return empNum;
    }

    @Override
    public String getEmpName() {
        return empName;
    }

    @Override
    public void setEmpName(String empName) {
        //return empName;
    }
    
    
    
}
