package Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyComparator implements Comparator<Integer> {

//    For descending
    @Override
    public int compare(Integer a, Integer b) {
        return b-a;
    }

//    For ascending
//    @Override
//    public int compare(Integer a, Integer b) {
//        return a-b;
//    }
}

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,2,5,4);
        list.sort(new MyComparator());
        System.out.println(list);
    }
}
