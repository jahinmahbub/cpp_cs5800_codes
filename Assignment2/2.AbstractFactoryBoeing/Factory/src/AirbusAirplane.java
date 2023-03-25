public class AirbusAirplane implements Airplane {
    @Override
    public void build() {
        System.out.println("Airbus built an airplane.");
    }

    @Override
    public void repair() {
        System.out.println("Airbus repaired an airplane.");
    }

    @Override
    public void restore() {
        System.out.println("Airbus restored an airplane.");
    }
}