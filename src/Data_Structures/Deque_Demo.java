package Data_Structures;

// https://www.geeksforgeeks.org/deque-interface-java-example/

import java.util.ArrayDeque;
import java.util.Deque;

import static java.lang.System.*;

public class Deque_Demo {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        int first = deque.removeFirst();
        int last = deque.removeLast();
        out.println("First: " + first + ", Last: " + last);
    }
}
