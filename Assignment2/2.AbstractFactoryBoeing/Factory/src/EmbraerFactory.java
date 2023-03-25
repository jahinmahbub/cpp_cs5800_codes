public class EmbraerFactory implements AirplaneFactory {
    @Override
    public Airplane createAirplane() {
        return new EmbraerAirplane();
    }
}