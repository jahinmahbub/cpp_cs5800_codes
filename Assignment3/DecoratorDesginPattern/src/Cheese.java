public class Cheese implements Topping {
    private FoodItem foodItem;
    private double price;
    private String description;

    public Cheese(FoodItem foodItem, double price) {
        this.foodItem = foodItem;
        this.price = price;
        this.description = "Cheese";
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public double getCost() {
        return foodItem.getCost() + price;
    }

    public String getDescription() {
        return foodItem.getDescription() + " with " + description;
    }
}