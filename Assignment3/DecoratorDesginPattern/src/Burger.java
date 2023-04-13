public class Burger implements FoodItem {
    private double basePrice;
    private String description;

    public Burger(double basePrice) {
        this.basePrice = basePrice;
        this.description = "Burger";
    }

    public double getCost() {
        return basePrice;
    }

    public String getDescription() {
        return description;
    }
}