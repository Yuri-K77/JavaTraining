package streamAPI.SAPI3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static streamAPI.SAPI3.StreamAPI3.countAddNumbers;


public class Main {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        System.out.println(countAddNumbers(list1));

        List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//        list2.add(9); //так нельзя добавить элемент - Unmodifiable List

        System.out.println(countAddNumbers(list2));

        var list3 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        list3.add(11); //так нельзя добавить элемент - Unmodifiable List

        System.out.println(countAddNumbers(list3));

    }
}