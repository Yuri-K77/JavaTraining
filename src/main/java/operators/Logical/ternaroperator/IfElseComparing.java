package operators.Logical.ternaroperator;

import java.util.Scanner;

public class IfElseComparing {

    public static void main(String[] args) {

        System.out.println("Введите два любых числа: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}