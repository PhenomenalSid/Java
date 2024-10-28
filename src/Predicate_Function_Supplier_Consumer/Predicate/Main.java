package Predicate_Function_Supplier_Consumer.Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

//        Predicate<Integer> pre = x -> (x > 5);
//        System.out.println(pre.test(6));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Predicate<Integer> pre1 = x -> x % 2 == 0;
        Predicate<Integer> pre2 = x -> x > 5;

        for(Integer i : list)
        {
//            Predicate<Integer> pre = pre1.and(pre2);
//            Predicate<Integer> pre = pre1.or(pre2);
//            Predicate<Integer> pre = pre1.negate();
//            Predicate<Integer> pre = Predicate.isEqual(1);
//            Predicate<Integer> pre = Predicate.isEqual(11);
            Predicate<Integer> pre = Predicate.not(pre1);

            if(pre.test(i))
            {
                System.out.println(i);
            }
        }
    }
}
