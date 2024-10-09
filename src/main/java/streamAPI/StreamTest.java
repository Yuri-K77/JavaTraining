package streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {

        Stream<Integer> intStream = IntStream.rangeClosed(1, 100).boxed();

        intStream
                .filter(i -> i%2==0)
                .map(i -> i/2)
                .filter(i -> i==51)
                .findAny()
                .orElseThrow(() -> new RuntimeException());
    }
}
