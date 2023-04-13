import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
    // Create the food items
    FoodItem deluxeBurger = new Burger(8.99);
    deluxeBurger = new Cheese(deluxeBurger, 1.50);
    deluxeBurger = new Bacon(deluxeBurger, 2.50);
    deluxeBurger = new ExtraSauce(deluxeBurger, 0.50);

    FoodItem fries = new Fries(2.99);
    FoodItem drink = new Drink(1.99);

    // Create the order
    List<FoodItem> items = new ArrayList<>();
    items.add(deluxeBurger);
    items.add(fries);
    items.add(drink);
    Order order = new Order(items);

    // Create the loyalty status
    LoyaltyStatus loyaltyStatus = new LoyaltyStatus("gold");

    // Calculate the total cost before the loyalty discount
    double totalCostBeforeDiscount = order.getTotalCost();
    System.out.println("Order Total before discount: $" + totalCostBeforeDiscount);

    // Apply the loyalty discount
    double totalCostAfterDiscount = loyaltyStatus.applyDiscount(totalCostBeforeDiscount);
    System.out.println("Order Total after discount: $" + totalCostAfterDiscount);

    // Print out the items and prices
    System.out.println("Order Items:");
    for (FoodItem item : items) {
        System.out.println(item.getDescription() + " - $" + item.getCost());
    }
  }
}