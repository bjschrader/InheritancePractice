package myinterface;
/**
 *
 * @author schra_000
 */
public class SalariedEmployee implements Employee {
    
    private double weeklySalary;
    //private String empName; //redundant
    private int empNum;
    private String lastName;
    private String firstName;

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    
//    @Override
//    public double getWage() {
//        return weeklySalary;
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


    
    
    
}
