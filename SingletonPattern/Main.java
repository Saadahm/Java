package SingletonPattern;

public class Main {
    public static void main(String []args){
        Logger logger1=Logger.getInstance();
        logger1.log(" A");

        Logger logger2=Logger.getInstance();
        logger2.log(" B");

    }
}
