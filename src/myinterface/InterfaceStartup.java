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
    private static double wage;
    public static void main(String[] args) {
        HourlyEmployee empC1 = new HourlyEmployee();
        empC1.setWage(wage);
        
        //System.out.println("test");
    }
}
