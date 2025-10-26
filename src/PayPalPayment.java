// Concrete Strategy 2 — payment by PayPal
public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " KZT using PayPal.");
    }
}