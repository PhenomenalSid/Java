package Functional_Interface;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.getHello();
        parent.defaultBye();
        Parent.staticBye();
    }
}
