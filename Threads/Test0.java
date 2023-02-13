//threads are light weight process 
//thread is like a worker who he going to do task for us..

class Worker extends Thread
{
    
    // public void run() {
    //    //run is a predefined method .when a thread is started it
    //    //automatically looks for run method
    //    //the job of a thread is defined inside run method.

    //    System.out.println("Hi,I am Thread: ...");
    // }
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Thread 1 Running ...."+new java.util.Date());

            try{
                Thread.sleep(1000);

            }
            catch(InterruptedException e)
            {
                e.printStackTrace();

            }
        }
    }

}
public class Test0 {

    public static void main(String[] args) {
    
        Worker w1=new Worker();
        w1.start();

    }
    
}
