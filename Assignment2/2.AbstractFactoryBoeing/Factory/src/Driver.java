public class Driver {
    public static void main(String[] args) {
        // Create car factories
        CarFactory hondaFactory = HondaFactory.getInstance();
        CarFactory porscheFactory = PorscheFactory.getInstance();
        CarFactory teslaFactory = TeslaFactory.getInstance();
             
        // Create airplane factories
        AirplaneFactory airbusFactory = AirbusFactory.getInstance();
        AirplaneFactory boeingFactory = BoeingFactory.getInstance();
        AirplaneFactory embraerFactory = EmbraerFactory.getInstance();

        // Attempt to create a second Tesla factory and Airbus factory (should not work)
        CarFactory teslaFactory2 = TeslaCarFactory.getInstance();
        AirplaneFactory airbusFactory2 = AirbusFactory.getInstance();

        // Add boat factories
        BoatFactory seaRayFactory = new SeaRayFactory();
        BoatFactory mastercraftFactory = new MastercraftFactory();
        BoatFactory bertramFactory = new BertramFactory();

        // Use the factories to build, repair, and restore vehicles
        Car hondaCar = hondaFactory.build();
        porscheFactory.repair(hondaCar);
        teslaFactory.restore(hondaCar);

        Airplane airbus = airbusFactory.build();
        boeingFactory.repair(airbus);
        embraerFactory.restore(airbus);

        Boat seaRay = seaRayFactory.build();
        mastercraftFactory.repair(seaRay);
        bertramFactory.restore(seaRay);

            
    }
}
