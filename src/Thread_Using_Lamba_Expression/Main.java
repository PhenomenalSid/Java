package Thread_Using_Lamba_Expression;

public class Main {

    public static void main(String[] args) {

//        RunnableImp runnableImp = new RunnableImp();
//        Thread thread = new Thread(runnableImp);
//        thread.run();

        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
    }
}
