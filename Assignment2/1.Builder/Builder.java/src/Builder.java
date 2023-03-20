import java.util.ArrayList;
import java.util.List;

public class Builder {
    private String chainName;
    private String size;
    private List<String> toppings;

    public Builder(String chainName) {
        this.chainName = chainName;
        this.toppings = new ArrayList<>();
    }

    public Builder size(String size) {
        this.size = size;
        return this;
    }

    public Builder toppings(List<String> toppings) {
        this.toppings = toppings;
        return this;
    }

    public Pizza build() {
        return new Pizza(chainName, size, toppings);
    }
}
