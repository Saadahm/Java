package ObserverPattern.With;

public class EmailSubscriber implements Subscriber{
    private String email;
    public EmailSubscriber(String email) { this.email = email; }
    @Override
    public void update(String channelName, String videoTitle) {
        System.out.printf("Email to %s: '%s' just dropped a new video: %s%n",
                email, channelName, videoTitle);
    }
    
}
