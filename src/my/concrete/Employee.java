package my.concrete;

/**
 *
 * @author schra_000
 */
public class Employee {

    private double wage;
    private int empNum;
    private String empName;

    public Employee() {

    }

    public Employee(int empNum, String empName) {

    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
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
