public class StripeGateway implements PaymentGateway {
    public void processPayment(double amount, String[] params) {
        String cardholderName = params[0];
        String cardNumber = params[1];
        String expirationDate = params[2];
        // code to process payment using Stripe gateway
        System.out.println("Payment processed using StripeGateway: " + amount + " USD, cardholder name: " + cardholderName + ", card number: " + cardNumber + ", expiration date: " + expirationDate);
    }
}