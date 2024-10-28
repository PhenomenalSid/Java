package Text_Block;

public class Main {

    public static void main(String[] args) {
        String name = "Siddharth Rawat";
        String company = "FreeCharge";
        String role = "BackEnd Developer";
        String s = String.format("""
                Hello, my name is %s.
                I am a %s at %s.
                That's it. Thank you for not paying attention.
                """, name, role, company);

        System.out.println(s);
    }
}

