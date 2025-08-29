package RestaurantManagementSystem;

import java.util.UUID;

public class Staff {
    private final String id;
    private final String name;
    private final Roles role;
    private boolean available;
    private String currentTask;

    public Staff(String name, Roles role) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.role = role;
        this.available = true;
    }
}