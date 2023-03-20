import java.util.List;

public class Pizza {
    private String chainName;
    private String size;
    private List<String> toppings;

    public Pizza(String chainName, String size, List<String> toppings) {
        this.chainName = chainName;
        this.size = size;
        this.toppings = toppings;
    }

    public String getChainName() {
        return chainName;
    }

    public String getSize() {
        return size;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void eat() {
        System.out.print("Eating at " + chainName + ". A " + size + " pizza with ");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.print(toppings.get(i));
            if (i < toppings.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}