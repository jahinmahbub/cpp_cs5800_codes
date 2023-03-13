public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;

    //Constructor
    
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    //Accessors

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    //Mutators
    
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

}
