package streamAPI;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToInt {

    public static void main(String[] args) {
        transformStreamToIntStream();
        transformIntStreamToStream();
    }

    private static void transformStreamToIntStream() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        IntStream intStream = stream.mapToInt(i -> Integer.valueOf(i));

        System.out.println(intStream.sum());
    }

    private static  void transformIntStreamToStream() {
        IntStream intStream = IntStream.rangeClosed(1, 10);

        System.out.println(intStream.boxed());
    }
}
