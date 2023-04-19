public class PaymentAdapter implements PaymentGateway {
    private PaymentGateway gateway;

    public PaymentAdapter(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processPayment(double amount, String[] params) {
        if (gateway instanceof PayPalGateway) {
            String[] adaptedParams = new String[2];
            adaptedParams[0] = params[0]; // email address
            adaptedParams[1] = ""; // unused
            gateway.processPayment(amount, adaptedParams);
        } else if (gateway instanceof StripeGateway) {
            gateway.processPayment(amount, params);
        } else if (gateway instanceof SquareGateway) {
            gateway.processPayment(amount, params);
        }
    }
}