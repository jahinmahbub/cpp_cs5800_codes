public class ExtraSauce implements Topping {
    private FoodItem foodItem;
    private double price;
    private String description;

    public ExtraSauce(FoodItem foodItem, double price) {
        this.foodItem = foodItem;
        this.price = price;
        this.description = "Extra Sauce";
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