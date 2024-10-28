package Predicate_Function_Supplier_Consumer.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
//        Consumer<String> csm = s -> System.out.println(s);
//        csm.accept("Ram");

        List<String> list = Arrays.asList("Siddharth", "Gourav", "Ayush", "Nikhil", "Sidhu");

        Consumer<List<String>> csm1 = l -> {
            for(String s: l)
            {
                System.out.println("Hi " + s);
            }
        };

        Consumer<List<String>> csm2 = l -> {
            for(String s: l)
            {
                System.out.println("Bye " + s);
            }
        };

        Consumer<List<String>> csm = csm1.andThen(csm2);
        csm.accept(list);
    }
}
