package playground;

/**
 *   - Function (done)
 *   - Consumer (done)
 *   - Supplier (done)
 *   - Producer
 *   - Predicate
 *   - Operator
 */

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Playground {
    public static void main(String[] args) {

        // Function
        // - takes a value and returns a value
        // - abstract method name is called `apply`
        Function<String, String> greeting =
                (String name) -> "Hello " + name;

        String result = greeting.apply("Michael");
        System.out.println(result);

        Function<Integer, Boolean> isOlder =
                (Integer age) -> age > 18;

        Boolean result2 = isOlder.apply(12);
        System.out.println(result2);

        // Consumer
        // - takes a value but returns nothing
        // - abstract method is called `accept`
        Consumer<String> print =
                (String message) -> System.out.println("Hello " + message);

        print.accept("World");

        // Supplier
        // - takes nothing but returns a value
        // - abstract method is called `get`

        Supplier<String> message =
                () -> "Merry Christmas and happy new year!";

        String result3 = message.get();
        System.out.println(result3);





        /* Practical example of consumer in streams */

        Consumer<Integer> printValue =
                (Integer value) -> System.out.println("value: " + value);

        // forEach(Consumer<? super T>)
        Stream.of(1, 2, 3).forEach(printValue);
    }
}
