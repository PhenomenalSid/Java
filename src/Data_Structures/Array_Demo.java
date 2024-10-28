package Data_Structures;

//  https://www.geeksforgeeks.org/arrays-in-java/

public class Array_Demo {
    public static void main(String[] args)
    {
        int[] arr;

        arr = new int[5];

        arr[0] = 1;
        arr[1] = 2;

        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}