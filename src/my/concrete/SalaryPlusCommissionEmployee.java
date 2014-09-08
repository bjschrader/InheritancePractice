package my.concrete;
/**
 *
 * @author schra_000
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
      private double commission;
      private double totalWeeklyPay;

   
    
    public double totalWeeklyPay (double totalWeeklyPay){
        if (commission > 0) {
            totalWeeklyPay = weeklySalary + commission;
        }return totalWeeklyPay;
    }public double getTotalWeeklyPay() {
        return totalWeeklyPay;
    }

    public void setTotalWeeklyPay(double totalWeeklyPay) {
        this.totalWeeklyPay = totalWeeklyPay;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

   
    
    
    
}
