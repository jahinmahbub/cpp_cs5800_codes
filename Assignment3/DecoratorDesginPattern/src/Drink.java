public class Drink implements FoodItem {
    private FoodItem foodItem;
    private double price;
    private String description;

    public Drink(double price) {
        this.price = price;
        this.description = "Drink";
    }


    public double getCost() {
        return  price;
    }

    public String getDescription() {
        return  description;
    }
}