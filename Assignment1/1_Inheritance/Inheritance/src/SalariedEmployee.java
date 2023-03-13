public class SalariedEmployee extends Employee{
    private double weeklySalary;

    //Constructor

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    //Accessor
    public double getWeeklySalary(){
        return weeklySalary;
    }

    //Mutator
    public void setWeeklySalary(double weeklySalary){
        this.weeklySalary = weeklySalary;
    }
}
