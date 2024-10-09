package enums.enum2;

import java.util.Arrays;

import static enums.enum2.DaysOfWeek.TUESDAY;

public class TestEnum {

    public static void main(String[] args) {

        Arrays.stream(DaysOfWeek.values())
                .forEach(i -> System.out.println(i.getFullName() + " " + i.getShortName()));

        System.out.println("\n" + DaysOfWeek.MONDAY.getFullName());

        System.out.println("\n" + TUESDAY.getFullName());
    }
}
