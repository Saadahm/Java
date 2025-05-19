package ObserverPattern.Without;

public class Main {
    public static void main(String[] args) {
        YouTube channel = new YouTube();

        // Add subscribers
        channel.addSubsriber("Alice");
        channel.addSubsriber("Bob");
        channel.addSubsriber("Charlie");

        System.out.println("=== Uploading first video ===");
        channel.uploadVideo("Java Tutorial Part 1");

        // Add more subscribers
        channel.addSubsriber("David");
        channel.addSubsriber("Emma");

        System.out.println("\n=== Uploading second video ===");
        channel.uploadVideo("Java Tutorial Part 2");
    }
}
