public class Ship {
    private String name;
    private String yearBuilt;

    // Constructor with all setters and getters
    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    // Accessors
    public String getName() {
        return name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    // Mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    // Print function
    public void print() {
        System.out.println("Ship name: " + name + ", year built: " + yearBuilt);
    }
}
