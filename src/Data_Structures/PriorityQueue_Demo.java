package Data_Structures;

// https://www.geeksforgeeks.org/priority-queue-class-in-java/

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_Demo {

    public static void main(String args[])
    {
//        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Comparator.reverseOrder());

        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);

        System.out.println(pQueue.peek());
        System.out.println(pQueue.poll());
        System.out.println(pQueue.peek());
    }
}
