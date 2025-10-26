// Concrete Strategy 1 — payment by Credit Card
public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " KZT using Credit Card.");
    }
}