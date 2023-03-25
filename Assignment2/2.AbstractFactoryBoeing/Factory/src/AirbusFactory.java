public class AirbusFactory implements AirplaneFactory {
    @Override
    public Airplane createAirplane() {
        return new AirbusAirplane();
    }
}