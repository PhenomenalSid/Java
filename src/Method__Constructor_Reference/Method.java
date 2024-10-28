package Method__Constructor_Reference;

import java.util.Arrays;
import java.util.List;

public class Method {

//    public static void hello(String s)
//    {
//        System.out.println("Hi " + s);
//    }

    public void hello(String s)
    {
        System.out.println("Hi " + s);
    }

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Siddharth", "Gourav", "Ayush", "Nikhil", "Sidhu");
//        list.forEach(Main::hello); // if hello is static
        list.forEach(new Method()::hello); // if hello is member function
    }
}
