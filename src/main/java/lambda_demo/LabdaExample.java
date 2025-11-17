package lambda_demo;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LabdaExample {
    public static void main(String[] args) {
        MathOperation sum = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println(sum.operation(5, 3));
        System.out.println(multiply.operation(5, 3));

        //Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(5));

        //Function
        Function<String, Integer> lengthFunc = str -> str.length();
        System.out.println(lengthFunc.apply("Hello"));

        //Consumer
        Consumer<String> printer = str -> System.out.println("Hello, " + str);
        printer.accept("Bob");

        //Supplier
        Supplier<Double> randomGenerator = Math::random;
        System.out.println(randomGenerator.get());


    }
}
