package Memento;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        TransactionManager txManager = new TransactionManager();

        //success scenario
        txManager.beginTransaction(db);
        db.insert("user1", "Aditya");
        db.insert("user2", "Rohit");
        txManager.commitTransaction();

        db.displayRecords();

        // Failed scenario
        txManager.beginTransaction(db);
        db.insert("user3", "Saurav");
        db.insert("user4", "Manish");

        db.displayRecords();

        // Some error -> Rollback
        System.out.println("ERROR: Something went wrong during transaction!");
        txManager.rollbackTransaction(db);

        db.displayRecords();
    }
}
