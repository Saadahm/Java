package ObserverPattern.With;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel {
    private String name;
    List<Subscriber> subscribers= new ArrayList<>();
    public YouTubeChannel(String name){
        this.name=name;
    }
    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }
    public void uploadVideo(String video)
    {
        System.out.printf("%n=== %s uploads: %s ===%n", name, video);
        notifySubs(video);
    }
    public void notifySubs(String video)
    {
        for (Subscriber s : subscribers) {
            s.update(name, video);
        }
    }
}
