package Data_Structures;

// https://www.geeksforgeeks.org/linkedhashmap-class-in-java/

import java.util.LinkedHashMap;

public class LinkedHashMap_Demo {

    public static void main(String a[])
    {
        LinkedHashMap<String, String> lhm
                = new LinkedHashMap<>();

        lhm.put("one", "practice.geeksforgeeks.org");
        lhm.put("two", "code.geeksforgeeks.org");
        lhm.put("four", "www.geeksforgeeks.org");

        System.out.println(lhm);

        System.out.println("Getting value for key 'one': "
                + lhm.get("one"));

        System.out.println("Size of the map: "
                + lhm.size());

        System.out.println("Is map empty? "
                + lhm.isEmpty());

        System.out.println("Contains key 'two'? "
                + lhm.containsKey("two"));

        System.out.println(
                "Contains value 'practice.geeks"
                        + "forgeeks.org'? "
                        + lhm.containsValue("practice"
                        + ".geeksforgeeks.org"));

        System.out.println("delete element 'one': "
                + lhm.remove("one"));

        System.out.println("Mappings of LinkedHashMap : "
                + lhm);
    }
}
