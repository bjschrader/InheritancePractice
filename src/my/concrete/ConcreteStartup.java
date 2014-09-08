package my.concrete;

import my.concrete.Employee;
import my.concrete.HourlyEmployee;
import my.concrete.SalariedEmployee;
import my.concrete.SalaryPlusCommissionEmployee;
/**
 *
 * @author schra_000
 */
public class ConcreteStartup {
    
    public static void main(String[] args) {
        double wage = 10;
        int hoursWorked = 60;
        
        HourlyEmployee empC1 = new HourlyEmployee();
        empC1.setHourlyWage(wage);
        empC1.setHoursWorkedPerWeek(hoursWorked);
        
        System.out.println("Total pay for the week is: $" + empC1.getTotalWeeklyPay());
         
       
    }
}
