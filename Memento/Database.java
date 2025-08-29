package Memento;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private Map<String, String> records;

    public Database() {
        records = new HashMap<>();
    }

    // Insert a record
    public void insert(String key, String value) {
        records.put(key, value);
        System.out.println("Inserted: " + key + " = " + value);
    }

    // Update a record
    public void update(String key, String value) {
        if (records.containsKey(key)) {
            records.put(key, value);
            System.out.println("Updated: " + key + " = " + value);
        } else {
            System.out.println("Key not found for update: " + key);
        }
    }

    // Delete a record
    public void remove(String key) {
        if (records.containsKey(key)) {
            records.remove(key);
            System.out.println("Deleted: " + key);
        } else {
            System.out.println("Key not found for deletion: " + key);
        }
    }

    // Create memento - Save current state
    public DatabaseMemento createMemento() {
        System.out.println("Creating database backup...");
        return new DatabaseMemento(records);
    }

    // Restore from memento - Rollback to saved state
    public void restoreFromMemento(DatabaseMemento memento) {
        records = new HashMap<>(memento.getState());
        System.out.println("Database restored from backup!");
    }

    // Display current database state
    public void displayRecords() {
        System.out.println("\n--- Current Database State ---");
        if (records.isEmpty()) {
            System.out.println("Database is empty");
        } else {
            for (Map.Entry<String, String> record : records.entrySet()) {
                System.out.println(record.getKey() + " = " + record.getValue());
            }
        }
        System.out.println("-----------------------------\n");
    }
}
