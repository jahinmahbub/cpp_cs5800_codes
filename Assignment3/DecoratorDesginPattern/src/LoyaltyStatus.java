public class LoyaltyStatus {
    private String status;

    public LoyaltyStatus(String status) {
        this.status = status;
    }

    public double applyDiscount(double totalCost) {
        if (status.equals("gold")) {
            return totalCost * 0.8;
        } else if (status.equals("silver")) {
            return totalCost * 0.9;
        } else {
            return totalCost;
        }
    }
}