package stream_api;

import java.util.*;
import java.util.stream.Stream;

public class StreamAPICreatDemo {
    public static void main(String[] args) {

        //List
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        Stream<String> stream = list.stream();

        //Arrays
        String[] array = {"Java", "Python", "C++"};
        Stream<String> stream2 = Arrays.stream(array);

        //Set
        Set<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4,5));
        Stream<Integer> stream3 = set.stream();

        //Map
        Map<Integer,String> map = Map.of(1,"One",2,"Two", 3, "Three");
        Stream<Integer> keys = map.keySet().stream();
        Stream<String> values = map.values().stream();
        Stream<Map.Entry<Integer, String>> entries = map.entrySet().stream();



    }
}
