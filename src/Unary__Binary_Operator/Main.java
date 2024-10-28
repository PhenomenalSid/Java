package Unary__Binary_Operator;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

//        Functional Methods Extension

//        Function<Integer, Integer> f = x -> x + 10;
        UnaryOperator<Integer> f = x -> x+10;
        System.out.println(f.apply(10));

//        BiFunction<String,String, String> s = (x,y) -> x + " " + y;
        BinaryOperator<String> s = (x,y) -> x + " " + y;
        System.out.println(s.apply("Ram", "Ji"));
    }
}
