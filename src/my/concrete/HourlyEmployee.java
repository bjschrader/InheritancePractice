package my.concrete;

/**
 *
 * @author schra_000
 */
public class HourlyEmployee extends Employee {

    private double hourlyWage;
    private int hoursWorkedPerWeek;
    private final static double OVER_TIME_PAY = 1.5;
    private double totalWeeklyPay;

    
    public double getTotalWeeklyPay() {
        totalWeeklyPay = 0;
        if (hoursWorkedPerWeek > 40) {
            totalWeeklyPay = ((hoursWorkedPerWeek - 40) * (OVER_TIME_PAY * hourlyWage)) + (hourlyWage * 40);
        } else {
            totalWeeklyPay = hoursWorkedPerWeek * hourlyWage;
        }
        return totalWeeklyPay;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursWorkedPerWeek() {
        return hoursWorkedPerWeek;
    }

    public void setHoursWorkedPerWeek(int hoursWorkedPerWeek) {
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }

}
