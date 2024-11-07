package operators.Logical.comparingofages;

import java.util.Scanner;

public class ComparingOfAges {

    private final static String DO_NOT_HAVE_TO_WORK = "You don't have to work";

    public static void main(String[] args) {

        System.out.println("Введите возраст: ");

        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        boolean isYoung = (age < 20);
        boolean isOld = (age > 60);

        if (isYoung || isOld) {
            System.out.println(DO_NOT_HAVE_TO_WORK);
        }
    }
}