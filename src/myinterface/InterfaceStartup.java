package myinterface;

import myinterface.Employee;
import myinterface.HourlyEmployee;
import myinterface.SalariedEmployee;
import myinterface.SalaryPlusCommissionEmployee;
/**
 *
 * @author schra_000
 */
public class InterfaceStartup {
    
    public static void main(String[] args) {
        double wage = 10;
        int hoursWorked = 60;
        
        HourlyEmployee empC1 = new HourlyEmployee();
        empC1.setWage(wage);
        empC1.setHoursWorked(hoursWorked);
        
        System.out.println("Total pay is: " + empC1.getTotalPay());
         
        //System.out.println("test");
    }
}
