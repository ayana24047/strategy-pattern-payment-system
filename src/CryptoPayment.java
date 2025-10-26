// Concrete Strategy 3 — payment by Cryptocurrency
public class CryptoPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " KZT using Cryptocurrency.");
    }
}