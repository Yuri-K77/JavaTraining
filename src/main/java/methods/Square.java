/* Написать метод возведения числа в квадрат */

package methods;

public class Square {
    static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        System.out.println(square(6));
        System.out.println(square(6) + 2);
    }
}