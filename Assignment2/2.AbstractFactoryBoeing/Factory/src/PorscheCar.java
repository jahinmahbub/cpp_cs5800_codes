public class PorscheCar implements Car {
    @Override
    public void build() {
        System.out.println("Porsche built a car.");
    }

    @Override
    public void repair() {
        System.out.println("Porsche repaired a car.");
    }

    @Override
    public void restore() {
        System.out.println("Porsche restored a car.");
    }
}