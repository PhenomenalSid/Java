package Predicate_Function_Supplier_Consumer.Function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

//        Function<String, Integer> fun = x -> x.length();
//        System.out.println(fun.apply("jdk"));;

//        Function<String, String> fun = x -> x.substring(0,3);
//
//        List<String> list = Arrays.asList("Siddharth", "Gourav", "Ayush", "Nikhil", "Sidhu");
//
//        Function<List<String>, List<String>> f = l -> {
//
//            List<String> res = new ArrayList<>();
//            for (String s : l)
//            {
//                if(fun.apply(s).equals("Sid"))
//                {
//                    res.add(s);
//                }
//            }
//
//            return res;
//        };
//
//        System.out.println(f.apply(list));

        Function<String, String> fun1 = x -> x.substring(0,3);
        Function<String, String> fun2 = x -> x.toUpperCase();

//        Function<String, String> fun =  fun1.andThen(fun2);
        Function<String, String> fun =  fun1.compose(fun2); // first fun2 then fun1 like fun2.andThen(fun1)

        System.out.println(fun.apply("abcdef"));
    }
}
