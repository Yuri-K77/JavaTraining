package operators.Logical.comparingofnumbers;

import java.util.Scanner;

public class ComparingOfNumbers {

    public static void main(String[] args) {

        System.out.println("Введите три любых числа: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a == b) && (b == c)) {
            System.out.println(a + " " + b + " " + c);
        } else if (a == b) {
            System.out.println(a + " " + b);
        } else if (b == c) {
            System.out.println(b + " " + c);
        } else if (a == c) {
            System.out.println(a + " " + c);
        }
    }
}