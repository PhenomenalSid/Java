package Lamba__Anonymous;

public class Lamba__Anonymous {

    int i = 1;

    public void ok()
    {
//        int i = 1;
        Employee employee = () -> {
//            int i = 2;
//            i = 2;
            System.out.println(i);
        };
        employee.show();

        Employee e = new Employee() {
            int i = 3;
            @Override
            public void show() {
                System.out.println(this.i);
//                System.out.println(this.i);
            }
        };

        e.show();
    }



    public static void main(String[] args) {
        Lamba__Anonymous l = new Lamba__Anonymous();
        l.ok();
    }
}
