package operators.Logical.ternaroperator;

import java.util.Scanner;

public class TernarComparing {

    public static void main(String[] args) {

        System.out.println("Введите два любых числа: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        //int comparing = Math.max(a, b);

        int comparing = a > b ? a : b;

        System.out.println(comparing);
    }
}
