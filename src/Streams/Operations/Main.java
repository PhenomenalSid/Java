package Streams.Operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

//    Stream -> convert to stream
//    ParallelStream -> convert to stream which will be processed by different threads
//    filter -> Predicate
//    map -> Function
//    peek -> Consumer
//    distinct -> Unique
//    sorted -> Sort
//    Comparator -> Inside sorted to tell sorting order
//    Limit -> Limit the no. of element in stream or collection
//    Skip -> Skip the elements from the start
//    Max ->  (a,b) -> (a-b) Returns max && (a,b) -> (b-a) Returns min
//    Min ->  (a,b) -> (a-b) Returns min && (a,b) -> (b-a) Returns max
//    Count -> returns no. of elements

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

//        List<Integer> collect = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
//        System.out.println(collect);

        List<Integer> collect = list.stream().map(x -> x * 2).collect(Collectors.toList());
        System.out.println(collect);
    }

}
