package Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//no need to assign tasks individually to these threads
public class ThreadPools {
    public static void main(String[] args) {
        //we can also have a cached thread pool here for i/o, shortlived tasks
        //prefer fixed in an interview
      ExecutorService pool=Executors.newFixedThreadPool(3);
        System.out.println("Thread pool created");
        for(int i=1;i<=7;i++)
        {
            int taskId=i;
            pool.execute(()->{
                System.out.println("Task:" + taskId + "started by"+Thread.currentThread().getName());
                try{
                    Thread.sleep(6000);
                }
                catch (InterruptedException e){}
                System.out.println("Task:" + taskId + "finished by"+Thread.currentThread().getName());
            });

        }
    }
}
