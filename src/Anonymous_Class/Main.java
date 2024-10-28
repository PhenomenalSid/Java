package Anonymous_Class;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee() {
            @Override
            public String role() {
                return "Data Engineer";
            }

            @Override
            public String salary() {
                return "100000";
            }
        };

        Employee employee2 = new Employee() {
            @Override
            public String role() {
                return "Software Engineer";
            }

            @Override
            public String salary() {
                return "200000";
            }
        };

        out.println(employee1.role());
        out.println(employee1.salary());
        out.println(employee2.role());
        out.println(employee2.salary());
    }
}
