public class SeaRayBoat implements Boat {
    @Override
    public void build() {
        System.out.println("Sea Ray built a boat.");
    }

    @Override
    public void repair() {
        System.out.println("Sea Ray repaired a boat.");
    }

    @Override
    public void restore() {
        System.out.println("Sea Ray restored a boat.");
    }
}
