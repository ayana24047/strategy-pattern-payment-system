# strategy-pattern-payment-system
Strategy Pattern — Payment System

This Java project demonstrates the Strategy Design Pattern using a simple Payment System.  
It shows how to dynamically switch between different payment methods (Credit Card, PayPal, Cryptocurrency) at runtime.

---

 What is the Strategy Pattern?

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.  
This allows the algorithm to vary independently from the clients that use it.

In this project, each payment method is a separate strategy implementing a common interface.  
The PaymentContext class selects which payment strategy to use during execution.

--Project Structure

PaymentSystem/
├── PaymentStrategy.java
├── CreditCardPayment.java
├── PayPalPayment.java
├── CryptoPayment.java
├── PaymentContext.java
└── PaymentSystem.java
 How It Works

1. The PaymentStrategy interface defines the method pay(double amount).  
2. Each Concrete Strategy (CreditCardPayment, PayPalPayment, CryptoPayment) implements the interface with different payment logic.  
3. The PaymentContext class holds the current strategy and calls its pay() method.  
4. The PaymentSystem (Main) file demonstrates switching between strategies at runtime
