package Method__Constructor_Reference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Const {

    public static class Student{
        public String name;

        public Student(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Siddharth", "Gourav", "Ayush", "Nikhil", "Sidhu");
        List<Student> res = list.stream().map(Student::new).collect(Collectors.toList());
        System.out.println(res);
    }
}
