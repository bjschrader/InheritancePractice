package myinterface;
import my.concrete.Employee;
import my.concrete.HourlyEmployee;
import my.concrete.SalariedEmployee;
import my.concrete.SalaryPlusCommissionEmployee;

/**
 *
 * @author schra_000
 */
public interface Employee2 {
    public abstract void work();
    
    public abstract int getWage();

    public abstract void setWage(int wage);

    public abstract String getName();

    public abstract void setName(String name);
}
