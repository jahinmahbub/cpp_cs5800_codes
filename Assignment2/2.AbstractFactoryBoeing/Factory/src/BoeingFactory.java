public class BoeingFactory implements AirplaneFactory {
    @Override
    public Airplane createAirplane() {
        return new BoeingAirplane();
    }
}