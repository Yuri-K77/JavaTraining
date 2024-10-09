package exceptions.myException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(new Integer[]{1, 2, 3});

        List<Integer> list2 = Arrays.asList(new Integer[]{4, 5, 6});

        try {
            MyClass.checkArraysEqual(list1, list2);
        } catch (CollectionsNotEqual e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Выполнилось в любом случае");
        }
    }
}