package SingletonPattern;

public class Logger {
    private static volatile Logger instance= null;
    private Logger()
    {

    }
   public static Logger getInstance()
    {
        if(instance==null)
        {
            synchronized (Logger.class){
                if(instance==null)
                    instance=new Logger();
            }
        }
        return instance;
    }
    void log(String msg)
    {
        System.out.println("Logging"+ msg);
    }
}
