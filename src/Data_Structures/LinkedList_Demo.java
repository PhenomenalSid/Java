package Data_Structures;

// https://www.geeksforgeeks.org/linked-list-in-java/
//

import java.util.LinkedList;

public class LinkedList_Demo {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        System.out.println(list);
    }
}
