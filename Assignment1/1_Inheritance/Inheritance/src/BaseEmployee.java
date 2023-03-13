public class BaseEmployee extends Employee{
    private double baseSalary;

    // Constructor

    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    // Accessor

    public double getBaseSalary() {
        return baseSalary;
    }

    //Mutator

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    } 
}
