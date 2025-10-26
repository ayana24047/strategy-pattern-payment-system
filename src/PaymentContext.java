// Context class — maintains a reference to a PaymentStrategy
// Allows dynamic strategy switching at runtime
public class PaymentContext {
    private PaymentStrategy strategy;

    // Constructor — sets initial payment method
    public PaymentContext(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Setter — change strategy dynamically
    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Executes payment using current strategy
    public void executePayment(double amount) {
        strategy.pay(amount);
    }
}
