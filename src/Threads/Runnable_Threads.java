package Threads;

//getPriority -> used to get the priority of the object of thread
//setPriority -> used to set the priority of the object of thread (1-10)
//sleep -> makes thread to wait for a certain time period and let other thread run

class C implements Runnable{
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("C");
        }
    }
}

class D implements Runnable {
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("D");
        }
    }
}


public class Runnable_Threads {

    public static void main(String[] args) {
        Runnable r1 = new C();
        Runnable r2 = new D();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
