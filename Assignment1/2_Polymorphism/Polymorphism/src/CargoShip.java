public class CargoShip extends Ship {

    private int cargoCapacity;

    // Constructor with all setters and getters
    public CargoShip(String name, String yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    // Accessor
    public int getCargoCapacity() {
        return cargoCapacity;
    }

     //Mutator

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    // Print function that overrides the base print function and will display the ship name and ships cargo capacity.
    @Override
    public void print() {
        System.out.println("Cargo Ship name: " + getName() + ", cargo capacity: " + cargoCapacity + " tons");
    }
    
}
