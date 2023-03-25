public class HondaFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new HondaCar();
    }
}