package ObserverPattern.With;

public interface Subscriber {
    void update(String channelName, String videoTitle);
}
