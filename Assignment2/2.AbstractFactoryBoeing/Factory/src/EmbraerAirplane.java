public class EmbraerAirplane implements Airplane {
    @Override
    public void build() {
        System.out.println("Embraer built an airplane.");
    }

    @Override
    public void repair() {
        System.out.println("Embraer repaired an airplane.");
    }

    @Override
    public void restore() {
        System.out.println("Embraer restored an airplane.");
    }
}