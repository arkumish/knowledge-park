/*
Here u need

context  ---- strategy interface 

u wll pass strategy to context

*/


// Step 1: Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Step 2: Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}

class PayPalPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using PayPal");
    }
}

// Step 3: Context (Uses the Strategy)
class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void executePayment(int amount) {
        strategy.pay(amount);
    }
}

// Step 4: Client Code
public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setPaymentStrategy(new CreditCardPayment());
        context.executePayment(100);

        context.setPaymentStrategy(new PayPalPayment());
        context.executePayment(200);
    }
}


