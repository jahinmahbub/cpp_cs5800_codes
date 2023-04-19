public interface PaymentGateway {
    void processPayment(double amount, String[] params);
}
