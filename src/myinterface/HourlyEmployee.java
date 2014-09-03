package myinterface;

/**
 *
 * @author schra_000
 */
public class HourlyEmployee implements Employee {

    private double wage;
    private int hoursWorked;
    private final static double OVER_TIME = 1.5;
    private String lastName;
    private int empNum;
    private String empName;
    private String firstName;
    private double totalPay;

    //@Override
    public double getTotalPay() {
        totalPay = 0;
        if (hoursWorked > 40) {
            totalPay = ((hoursWorked - 40) * (OVER_TIME * wage)) + (wage * 40);
        } else {
            totalPay = hoursWorked * wage;
        }
        return totalPay;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

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
