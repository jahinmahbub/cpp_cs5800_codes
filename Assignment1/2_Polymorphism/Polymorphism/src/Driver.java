public class Driver {
    public static void main(String[] args) {
        // We Initialize an array of Ship size of 3
        Ship[] ships = new Ship[3];

        // We Dynamically initialize the array with one type each of Ship, CruiseShip, and CargoShip objects
        ships[0] = new Ship("Viking Line", "2000");
        ships[1] = new CruiseShip("L.T. Ahmadullah", "2016", 24);
        ships[2] = new CargoShip("Yara Birkeland", "2003", 851694);

        // Iterating through the array to call each print function
        for (Ship ship : ships) {
            ship.print();
        }
    }
}
