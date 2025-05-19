package ObserverPattern.With;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel codeWithMe = new YouTubeChannel("CodeWithMe");

        codeWithMe.addSubscriber(new EmailSubscriber("alice@example.com"));
        codeWithMe.addSubscriber(new MobileSubscriber("+1234567890"));

        codeWithMe.uploadVideo("Java Tutorial Part 1");
        codeWithMe.uploadVideo("Design Patterns in Java");
    }
}
