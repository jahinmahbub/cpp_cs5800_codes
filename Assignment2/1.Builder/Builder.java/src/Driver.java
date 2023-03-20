import java.util.Arrays;

public class Driver {
    public static void main(String[] args) throws Exception {
        // Pizza Hut pizzas
        Pizza pizza1 = new Builder("Pizza Hut")
                                  .size("Small")
                                  .toppings(Arrays.asList("Pepperoni", "Mushrooms"))
                                  .build();
        pizza1.eat();

        Pizza pizza2 = new Builder("Pizza Hut")
                                  .size("Large")
                                  .toppings(Arrays.asList("Sausage","Bacon","Peppers"))
                                  .build();
        pizza2.eat();

        // Little Caesars pizzas
        Pizza pizza3 = new Builder("Little Caesars")
                                  .size("Medium")
                                  .toppings(Arrays.asList("Pepperoni","Sausage","Mushrooms","Bacon","Onions","Extra Cheese","Peppers","Chicken"))
                                  .build();
        pizza3.eat();

        Pizza pizza4 = new Builder("Little Caesars")
                                   .size("Small")
                                   .toppings(Arrays.asList("Sausage","Mushrooms","Ham and Pineapple","Bacon","Extra Cheese","Ham"))
                                   .build();
        pizza4.eat();

        // Dominos pizzas
        Pizza pizza5 = new Builder("Dominos")
                                   .size("Small")
                                   .toppings(Arrays.asList("Tomato and Basil"))
                                   .build();
        pizza5.eat();

        Pizza pizza6 = new Builder("Dominos")
                                   .size("Large")
                                   .toppings(Arrays.asList("Sausage","Mushrooms","Onions"))
                                   .build();
        pizza6.eat();
    }
}
