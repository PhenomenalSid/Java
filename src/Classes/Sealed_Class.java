package Classes;

// sealed class only allows the classes, who have the permit, to inherit it
//final classes cannot be inherited by any other classes
//non-sealed classes allows other classes to inherit their properties

// Sealed interface is also there

sealed class A permits B {

    String getHello()
    {
        return "A Hello";
    }
}

non-sealed class B extends A {

    @Override
    String getHello()
    {
        return "B Hello";
    }
}

class C extends B {

    String getHello()
    {
        return "C Hello";
    }
}

public class Sealed_Class {

    public static void main(String[] args) {

        A a = new C();
        System.out.println(a.getHello());
    }
}
