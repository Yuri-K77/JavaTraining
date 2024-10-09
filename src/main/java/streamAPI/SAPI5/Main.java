package streamAPI.SAPI5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<String> list3 = Arrays.asList("nick", "jack");

        list2
                .stream()
                .forEach(i -> list1.add(i));

        list1
                .stream()
                .forEach(i -> System.out.println(i));

        Stream stream = Stream.of(1, 2, 3, 4, 5, 6);

        //*************************
        list2.stream().forEach((i) -> System.out.println(i+100));

        list3.stream().map((i) -> i + "@gmail.com").forEach((i) -> System.out.println(i));

        List<String> emails = list3.stream().map((i) -> i + "@gmail.com").collect(Collectors.toList());
        System.out.println(emails.get(0));

        System.out.println(list2.stream().filter(i -> i%2 != 0).count());

        //System.out.println(list2.stream().filter(i -> i == 7).findFirst().orElseThrow(() -> new RuntimeException()));

        System.out.println(list2.stream().noneMatch(i -> i == 7));
    }
}
