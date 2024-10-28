package Streams.How_to_create_stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

//        List<Integer> list = Arrays.asList(1,2,3,4);
//        Stream<Integer> stream = list.stream();

//        Integer[] arr = {1,2,3,4};
//        Stream<Integer> stream = Arrays.stream(arr);

//        Stream<Integer> stream = Stream.of(1,2,3,4);

//        Stream<Integer> stream = Stream.iterate(0, n -> n + 1).limit(100);

        Stream<Integer> stream = Stream.generate(() -> (int) (Math.random() * 100)).limit(100);
    }
}
