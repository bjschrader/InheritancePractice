package my.concrete;

/**
 *
 * @author schra_000
 */
public class SalariedEmployee extends Employee {
    
    double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
//    @Override
    public double getTotalPay() {
        return salary;
    }
    
    
    
}
