package myabstract;

/**
 *
 * @author schra_000
 */
public class HourlyEmployee extends Employee {
    
    private double wage;
    private int hoursWorked;
    private final static double OVER_TIME = 1.5;

    
    
    @Override
    public double getWage() {
        double wagesEarned = 0;
        if (hoursWorked > 40) {
            wagesEarned = ((hoursWorked - 40) * OVER_TIME);
        } else {
            wagesEarned = hoursWorked * wage;
        }
        return wagesEarned;
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
    
    
    
    
}