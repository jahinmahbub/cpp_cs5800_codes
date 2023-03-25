public class HondaCar implements Car {
    @Override
    public void build() {
        System.out.println("Honda built a car.");
    }

    @Override
    public void repair() {
        System.out.println("Honda repaired a car.");
    }

    @Override
    public void restore() {
        System.out.println("Honda restored a car.");
    }
}