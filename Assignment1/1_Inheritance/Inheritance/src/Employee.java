public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    // Constructor

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    // Accessors

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    // Mutators

    public void setFirstname(String firstName){
        this.firstName = firstName;
    }

    public void setLastname(String LastName){
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber){
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
}
