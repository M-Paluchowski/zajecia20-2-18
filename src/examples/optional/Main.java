package examples.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Integer a = null;

        if (a != null) {
            Integer result = a + 3;
            System.out.println(result);
        }

        //-------------------------------------------

        Optional.ofNullable(null);
//        Optional.of(null);
        Optional.empty();

        //-------------------------------------------

        //NIE ROBIMY TAK
        Optional<Integer> integer = Optional.of(1);
        if (integer.isPresent()) {
            int result = integer.get() + 3;
            System.out.println(result);
        }

        Optional<Integer> integer1 = Optional.empty();
//        Integer integer2 = integer1.get();

        //-------------------------------------------
        Optional.of(1)
                .map(number -> number + 3)
                .ifPresent(System.out::println);

        Integer b = null;
        Optional.ofNullable(b)
                .map(number -> number + 3)
                .ifPresent(System.out::println);

        //-------------------------------------------
        Optional.of(1)
                .map(number -> number + 3)
                .map(number -> number * 2)
                .map(number -> changeValue(number))
                .ifPresent(System.out::println);
        //-------------------------------------------
        Integer integer2 = Optional.of(1)
                .orElse(3);

        System.out.println(integer2);

        Integer integer3 = Optional.ofNullable(b)
                .orElse(3);
        System.out.println(integer3);

        //-------------------------------------------
        Optional.ofNullable(b)
                .ifPresentOrElse(number -> System.out.println(number), () -> System.out.println("Brak wyników"));
        //-------------------------------------------
        Optional.ofNullable(b)
                .orElseGet(() -> 3);
    }

    private static Integer changeValue(int value) {
        //boolean ? valueLeft : valueRight;
//        if (value % 2 == 0) {
//            return null;
//        } else {
//            return value;
//        }
        return value % 2 == 0 ? null : value;
    }
}
