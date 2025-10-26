//Client class — demonstrates the Strategy Pattern in action
public class PaymentSystem {
    public static void main(String[] args) {

        // Start with Credit Card payment
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.executePayment(10000);

        // Switch to PayPal payment
        context.setStrategy(new PayPalPayment());
        context.executePayment(5000);

        // Switch to Cryptocurrency payment
        context.setStrategy(new CryptoPayment());
        context.executePayment(20000);
    }
}