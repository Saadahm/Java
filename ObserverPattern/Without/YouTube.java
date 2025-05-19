package ObserverPattern.Without;

import java.util.ArrayList;
import java.util.List;

public class YouTube {
    private List<String>subscribers= new ArrayList<>();
    private String video;
    public void addSubsriber(String subscriber)
    {
        subscribers.add(subscriber);

    }
    public void uploadVideo(String video)
    {
        this.video=video;
        notifyChild();  //everyone treated same
    }
    public void notifyChild()
    {
        for(String s: subscribers)
        {
            System.out.println("Hi");
        }
    }


}
