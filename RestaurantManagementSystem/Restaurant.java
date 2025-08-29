package RestaurantManagementSystem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Restaurant {
    private final Map<String, MenuItem> menu = new ConcurrentHashMap<>();
    private final Map<String, Order> orders = new ConcurrentHashMap<>();
    private final Map<String, Reservation> reservations = new ConcurrentHashMap<>();
    private final Map<String, Payment> payments = new ConcurrentHashMap<>();
    private final Map<String, Staff> staff = new ConcurrentHashMap<>();
    private final Map<Integer, Table> tables = new ConcurrentHashMap<>();

    public Reservation makeReservation(Customer customer, int partySize, LocalDateTime dateTime) {
        Table table = findTable(partySize);
        if (table == null)
            throw new IllegalStateException("No available tables for " + partySize + " people");
        Reservation reservation = new Reservation(customer, table, dateTime);
        reservations.put(reservation.getId(), reservation);
        return reservation;
    }

    public Table findTable(int size) {
        return tables.values().stream()
                .filter(t -> !t.isReserved() && t.getCapacity() >= size).findFirst().orElse(null);
    }

    public Order placeOrder(Customer customer, List<MenuItem> items) {
        {
            Order order = new Order(customer, items);
//        order.assignCook();
        }
        return null;
    }
}
// void assignCook()
//        {
//            order.assignWaiter();
//
//        }
//
//        void processPayment()
//        {
//            double amount =
//
//            Payment payment= new Payment(amount,str)
//        }

