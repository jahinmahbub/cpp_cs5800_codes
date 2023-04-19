public class Driver {
    public static void main(String[] args) {
        // create PayPalGateway, StripeGateway and SquareGateway objects
        PaymentGateway paypal = new PayPalGateway();
        PaymentGateway stripe = new StripeGateway();
        PaymentGateway square = new SquareGateway();

        // create PaymentAdapter objects for PayPal, Stripe and Square
        PaymentGateway paypalAdapter = new PaymentAdapter(paypal);
        PaymentGateway stripeAdapter = new PaymentAdapter(stripe);
        PaymentGateway squareAdapter = new PaymentAdapter(square);

        // process payment using PayPal gateway
        double amount = 152.78;
        String[] paypalParams = new String[]{"LexLuthor@lexcorp.com"};
        paypalAdapter.processPayment(amount, paypalParams);

        // process payment using Stripe gateway
        String[] stripeParams = new String[]{"Obergruppenfuhrer John Smith", "1234567891234567", "08/28"};
        stripeAdapter.processPayment(amount, stripeParams);

        // process payment using Square gateway
        String[] squareParams = new String[]{"Waco"};
        squareAdapter.processPayment(amount, squareParams);
    }
}