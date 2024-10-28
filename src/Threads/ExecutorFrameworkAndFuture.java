package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Executor Service Methods

//submit -> inside submit, the arguments can be either callable or runnable or runnable and return value
//awaitTermination
//isTerminated
//shutdown
//shutdownnow
//isshutdown
//invokeAll -> return future, order is automatically maintained, have other argument for time-period
//invokeAny -> return result of first thread

//Future

// get
// get(time) -> wait for a certain period for result
// isDone -> to check whether the task is done
// cancel -> cancel the task
// isCancelled -> check

// Scheduled Executor Service

// schedule()

// scheduleAtFixedRate(function, initial delay, period, unit)
// for scheduleAtFixedRate, we can't just use shutdown, we have to schedule another task for shutdown purpose only

// scheduleWithFixedDelay(function, initial delay, period, unit) -> we schedule a delay after a task is done

//newCachedThreadPool -> no limit on threads, should be used when tasks are short lived and variable in numbers

public class ExecutorFrameworkAndFuture {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i < 10; i++) {
            int finalI = i;
            executor.submit(() -> {
                long result = factorial(finalI);
                System.out.println(result);
            });

//            Future<?> future = executor.submit(() -> {
//                long result = factorial(finalI);
//                System.out.println(result);
//            });
//
//            future.isDone(); // check whether the work is done
//            future.get(); // return value if there is any
        }
        executor.shutdown();
//        executor.shutdownNow();

        try {

            // After shutdown, wait for the specified time and then execute the next lines of code
            executor.awaitTermination(3, TimeUnit.SECONDS);

//            while(!executor.awaitTermination(1, TimeUnit.MILLISECONDS))
//            {
//                System.out.println("Waiting!");
//            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Total time " + (System.currentTimeMillis() - startTime));
    }

    private static long factorial(int n) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
