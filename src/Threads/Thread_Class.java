package Threads;

//getPriority -> used to get the priority of the object of thread
//setPriority -> used to set the priority of the object of thread (1-10)
//sleep -> makes thread to wait for a certain time period and let other thread run

//Other ways to create thread in Runnable Threads

//join is used to make the Main function to wait for the thread to come back and then start running again

//synchronized in function is used to make sure that only one thread calls that function at a time

//When we make a thread, it goes to new state
//New -> when we start the thread, it goes to Runnable state
//Runnable -> when we run the thread, it goes to Running state
//Running -> when we stop the running thread, it goes to dead state
//Dead -> when the thread ends or we stop the thread, it dies
//Sleeping -> when we make the thread sleep, it goes to sleeping state

class A extends Thread {
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("A");
        }
    }
}

class B extends Thread {
    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("B");
        }
    }
}

public class Thread_Class {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
