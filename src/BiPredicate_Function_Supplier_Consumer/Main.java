package BiPredicate_Function_Supplier_Consumer;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {
    public static void main(String[] args) {
        BiPredicate<Integer, String> predicate = new BiPredicate<Integer, String>() {
            @Override
            public boolean test(Integer n, String s) {
                return (n >= 18 && s.equals("Vote"));
            }
        };

        System.out.println(predicate.test(18,"Vot"));

        BiFunction<Integer, Integer, String> functional = new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer n1, Integer n2) {
                Integer n = n1 + n2;
                return n1 + n2 >= 100 ? "Total is enough" : "Total is not enough";
            }
        };

        System.out.println(functional.apply(12,88));

        BiConsumer<Integer, String> consumer = new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                if(integer >= 100){
                    System.out.println(s);
                }
                else{
                    System.out.println("Not " + s);
                }
            }
        };

        consumer.accept(100,"Enough");
    }
}
