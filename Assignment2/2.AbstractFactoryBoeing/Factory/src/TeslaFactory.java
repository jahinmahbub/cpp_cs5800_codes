public class TeslaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new TeslaCar();
    }
}