package Concurrency;

public class ThreadLifecycle {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread waiter = new Thread(() -> {
            System.out.println("Waiter is waiting to prepare the dish");
            synchronized (lock) {
                try {
                    lock.wait(); //means we enter the waiting queue of this lock and release the key
                } catch (InterruptedException e) {

                }
            }
            System.out.println("Waiter: got the dish! serving...");
        });

        Thread chef = new Thread(() -> {
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
            }
            System.out.println("Chef preparing");
            synchronized (lock) {
                lock.notify();
            }
            try { Thread.sleep(10); } catch (InterruptedException ignored) {}
            System.out.println("Dish Served");
        });
        waiter.start();
        chef.start();
    }
}
