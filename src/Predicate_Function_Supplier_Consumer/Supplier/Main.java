package Predicate_Function_Supplier_Consumer.Supplier;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Supplier<String> sup = () -> "Hi";
        System.out.println(sup.get());;
    }
}
