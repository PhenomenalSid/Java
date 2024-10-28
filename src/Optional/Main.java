package Optional;

import java.util.Optional;

public class Main {

//    Optional.ofNullable -> if value inside the box can be nullable
//    isPresent -> return bool
//    ifPresent -> Consumer, takes and return nothing
//    orElse -> return if value is null
//    orElseGet -> supplier , takes nothing but give something
//    orElseThrow -> supplier, throws exception
//    map -> function, return new Optional after doing some operation on value

    public static Optional<String> getName(Long id)
    {
        return Optional.of("Ram");
//        return Optional.ofNullable(null);
    }

    public static void main(String[] args) {

        Optional<String> name = getName(2L);
//        name.ifPresent(System.out::println);
        String res = name.orElse("NA");
        System.out.println(res);
//        String res = name.orElseGet(() -> "NA");
//        String res = name.orElseThrow(NoSuchElementException::new);
//        Optional<String> s = name.map(String::toUpperCase);
//        System.out.println(s.get());
    }
}
