package myabstract;

import myabstract.Employee;
import myabstract.HourlyEmployee;
import myabstract.SalariedEmployee;
import myabstract.SalaryPlusCommissionEmployee;
/**
 *
 * @author schra_000
 */
public class AbstractStartup {
    private static double wage;
    public static void main(String[] args) {
        HourlyEmployee empC1 = new HourlyEmployee();
        empC1.setWage(wage);
        
        //System.out.println("test");
    }
}
