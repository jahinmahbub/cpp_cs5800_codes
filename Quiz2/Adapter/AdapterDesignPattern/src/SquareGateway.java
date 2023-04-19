public class SquareGateway implements PaymentGateway {
    public void processPayment(double amount, String[] params) {
        String locationId = params[0];
        // code to process payment using Square gateway
        System.out.println("Payment processed using SquareGateway: " + amount + " USD, location ID: " + locationId);
    }
}