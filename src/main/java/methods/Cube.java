/* Напишите метод, с помощью которого можно было бы возводить число в куб */

package methods;

public class Cube {
    static int cube(int a) {
        return a * a * a;
    }

    public static void main(String[] args) {
        System.out.println(cube(22));
    }
}