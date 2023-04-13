import java.util.List;

public class Order {
    private List<FoodItem> items;

    public Order(List<FoodItem> items) {
        this.items = items;
    }

    public double getTotalCost() {
        double totalCost = 0.0;

        for (FoodItem item : items) {
            totalCost += item.getCost();
        }

        return totalCost;
    }
}