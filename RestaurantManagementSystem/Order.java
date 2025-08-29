package RestaurantManagementSystem;

import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private final Customer customer;
    private final List<MenuItem> items;
    private OrderStatus status;
    private Payment payment;
    private Staff assignedCook;
    private Staff assignedWaiter;

    public Order(Customer customer, List<MenuItem> items) {
        this.id = UUID.randomUUID().toString();
        this.customer = customer;
        this.items = items;
        this.status = OrderStatus.NEW;
    }
}
