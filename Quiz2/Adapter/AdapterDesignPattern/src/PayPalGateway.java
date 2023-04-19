public class PayPalGateway implements PaymentGateway {
    public void processPayment(double amount, String[] params) {
        String userEmail = params[0];
        // code to process payment using PayPal gateway
        System.out.println("Payment processed using PayPalGateway: " + amount + " USD, user email: " + userEmail);
    }
}