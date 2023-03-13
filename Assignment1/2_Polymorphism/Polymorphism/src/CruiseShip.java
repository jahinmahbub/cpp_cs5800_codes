public class CruiseShip extends Ship{

    private int maxPassengers;

    // Constructor with all setters and getters
    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    // Accessor
    public int getMaxPassengers() {
        return maxPassengers;
    }

    //Mutator

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    // Print function that overrides the base print function and will display the ship name and maximum number of passengers.
    @Override
    public void print() {
        System.out.println("Cruise Ship name: " + getName() + ", maximum passengers: " + maxPassengers);
    }
    
}
