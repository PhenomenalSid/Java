package Data_Structures;

// https://www.geeksforgeeks.org/arraylist-in-java/
//

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Demo {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("He", "Me", "I"));
        System.out.println(arr);
    }
}
