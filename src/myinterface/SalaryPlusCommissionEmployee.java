package myinterface;
/**
 *
 * @author schra_000
 */
public class SalaryPlusCommissionEmployee extends SalariedEmployee {
    
    private double commission;
    private double salary;
    private double totalPay;
    private String lastName;
    private int empNum;
    private String firstName;
    
    //@Override
    public double totalPay (){
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
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        //return lastName;
    }

    @Override
    public int getEmpNum() {
        return empNum;
    }

    @Override
    public void setEmpNum(int empNum) {
        //return empNum;
    }

    
}
