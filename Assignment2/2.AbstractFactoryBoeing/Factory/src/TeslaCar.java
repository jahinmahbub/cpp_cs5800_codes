public class TeslaCar implements Car {
    @Override
    public void build() {
        System.out.println("Tesla built a car.");
    }

    @Override
    public void repair() {
        System.out.println("Tesla repaired a car.");
    }

    @Override
    public void restore() {
        System.out.println("Tesla restored a car.");
    }
}