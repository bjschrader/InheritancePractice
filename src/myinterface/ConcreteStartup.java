package myinterface;
import my.concrete.*;
import my.concrete.Employee;
import my.concrete.HourlyEmployee;
import my.concrete.SalariedEmployee;
import my.concrete.SalaryPlusCommissionEmployee;
/**
 *
 * @author schra_000
 */
public class ConcreteStartup {
    private static double wage;
    public static void main(String[] args) {
        HourlyEmployee empC1 = new HourlyEmployee();
        empC1.setWage(wage);
        
        //System.out.println("test");
    }
}
