package Classes;

//Record classes are classes which are used to hold data
//They have in-built constructor but you can also give your implementation
//Have isEqual method to only equate values, not addresses
//You can only implement interfaces, not classes
//You can also define your methods inside record
//Cannot use any types of variables inside record except static
//Access value by using variable names as function

record Student (int id, String name)  {

//    int c;
    static int c;

    public Student
    {
        if(id == 0)
            throw new IllegalArgumentException("ID cannot be zero");

        c++;
    }
};


public class Record_Class {

    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Ram");
            System.out.println(s1);
            System.out.println(s1.name());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student 1: " + e.getMessage());
        }

        try {
            Student s2 = new Student(2, "Shyam");
            System.out.println(s2);
            System.out.println(s2.name());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student 2: " + e.getMessage());
        }

        try {
            Student s3 = new Student(0, "Error");
            System.out.println(s3);
            System.out.println(s3.name());
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating student 3: " + e.getMessage());
        }

        System.out.println("The value of static c is " + Student.c);
    }
}
