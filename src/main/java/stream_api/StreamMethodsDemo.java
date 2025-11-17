package stream_api;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsDemo {
    public static void main(String[] args) {

        //.filter
        List<String> names = Arrays.asList("John", "Anna", "Mike", "Dave");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);

        //.map
        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(lengths);

        //.flatMap

        //.sorted

        //.distinct

        //.limit

        //.skip



        //.forEach

        //.collect

        //.count

        //.anyMatch
        //.all.Match
        //.noneMatch

    }


}
