package my.concrete;

/**
 *
 * @author schra_000
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;
    private double salary;
    private double totalPay;
    
    @Override
    public double getWage (){
        if (commission > 0) {
            totalPay = salary + commission;
        }return totalPay;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }
    
    
    
}
