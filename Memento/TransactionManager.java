package Memento;

public class TransactionManager {
    private DatabaseMemento backup;

    public TransactionManager() {
        backup = null;
    }

    // Begin transaction - create backup
    public void beginTransaction(Database db) {
        System.out.println("=== BEGIN TRANSACTION ===");
        backup = db.createMemento();
    }

    // Commit transaction - discard backup
    public void commitTransaction() {
        System.out.println("=== COMMIT TRANSACTION ===");
        if (backup != null) {
            backup = null;
        }
        System.out.println("Transaction committed successfully!");
    }

    // Rollback transaction - restore from backup
    public void rollbackTransaction(Database db) {
        System.out.println("=== ROLLBACK TRANSACTION ===");
        if (backup != null) {
            db.restoreFromMemento(backup);
            backup = null;
            System.out.println("Transaction rolled back!");
        } else {
            System.out.println("No backup available for rollback!");
        }
    }
}

