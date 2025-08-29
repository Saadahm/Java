package RestaurantManagementSystem;

import java.time.LocalDateTime;
import java.util.UUID;

public class Payment {
    private final String id;
    private final double amount;
    private final PaymentMethod method;
    private PaymentStatus status;
    private final LocalDateTime timestamp;

    public Payment(double amount, PaymentMethod method) {
        this.id = UUID.randomUUID().toString();
        this.amount = amount;
        this.method = method;
        this.status = PaymentStatus.PENDING;
        this.timestamp = LocalDateTime.now();
    }

    public void process() {
        PaymentStrategy strategy = switch (method) {
            case CASH -> new Cash();
            case CREDIT_CARD -> new CreditCard();
        };

        try {
            strategy.processPayment(amount);
            status = PaymentStatus.COMPLETED;
        } catch (Exception e) {
            status = PaymentStatus.FAILED;
            System.out.println("Payment failed: " + e.getMessage());
        }
    }

    // Getters
    public String getId() { return id; }
    public double getAmount() { return amount; }
    public PaymentStatus getStatus() { return status; }
}
