package Data_Structures;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

// https://www.geeksforgeeks.org/treeset-in-java-with-examples/

public class TreeSet_Demo {

    public static void main(String[] args)
    {
        Set<String> ts = new TreeSet<>();
//        TreeSet<String> ts = new TreeSet<>(Comparator.reverseOrder());

        ts.add("Geek");
        ts.add("For");
        ts.add("Geeks");
        ts.add("A");
        ts.add("B");
        ts.add("Z");

        for (String value : ts)
            System.out.print(value + ", ");

        System.out.println();
    }
}
