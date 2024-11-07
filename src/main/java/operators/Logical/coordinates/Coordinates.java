package operators.Logical.coordinates;

import java.util.Scanner;

public class Coordinates {

    public static void main(String[] args) {

        System.out.println("Введите координаты: ");

        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) {
            System.out.println(1);
        } else if (x < 0 && y > 0) {
            System.out.println(2);
        } else if (x < 0 && y < 0) {
            System.out.println(3);
        } else if (x > 0 && y < 0) {
            System.out.println(4);
        }
    }
}