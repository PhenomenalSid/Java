package Custom_Annotation;

import java.lang.reflect.Method;

import static java.lang.System.*;


class sub {

    @MyCustomAnnotation(value = "Hi", count = 10)
    public void hello()
    {
        out.println("Hello World! This is a sub class");
    }
}

public class Main {

    public static void main(String[] args) throws NoSuchMethodException {

        Method method = sub.class.getMethod("hello");

        if (method.isAnnotationPresent(MyCustomAnnotation.class)) {
            MyCustomAnnotation annotation = (method).getAnnotation(MyCustomAnnotation.class);

            out.println("Value: " + annotation.value());
            out.println("Number: " + annotation.count());
        }
    }
}
