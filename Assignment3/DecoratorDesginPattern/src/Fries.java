public class Fries implements FoodItem {
    private FoodItem foodItem;
    private double price;
    private String description;

    public Fries(double price) {
        this.price = price;
        this.description = "Fries";
    }


    public double getCost() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}