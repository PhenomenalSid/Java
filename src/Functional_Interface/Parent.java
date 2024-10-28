package Functional_Interface;

@FunctionalInterface
public interface Parent {

    void getHello();

    default void defaultBye()
    {
        System.out.println("Parent Default Bye");
    }

    static void staticBye()
    {
        System.out.println("Parent Static Bye");
    }
}
