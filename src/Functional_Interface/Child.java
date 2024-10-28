package Functional_Interface;

public class Child implements Parent {

    @Override
    public void getHello() {
        System.out.println("Child Abstract Bye");
    }

    @Override
    public void defaultBye() {
//        Parent.super.defaultBye();
        System.out.println("Child Default Bye");
    }
}
