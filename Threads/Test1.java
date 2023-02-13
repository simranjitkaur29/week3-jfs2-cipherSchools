//creating threads using runnable 
class Worker1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println("Thread One is working ");
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }

    }
}
class Worker2 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=20;i++)
        {
            System.out.println("Hello from Thread two");
        }
        try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
    }
}

public class Test1 {
    Thread t1,t2;
    Test1()
    {
        t1=new Thread(new Worker1());
        t2=new Thread(new Worker2());

        t1.setPriority(5);
        t2.setPriority(10);//periority range 1 to 10 ->1 is minimum

        t1.start();
        t2.start();

    }
    public static void main(String[] args) {
        new Test1();
    }
}
