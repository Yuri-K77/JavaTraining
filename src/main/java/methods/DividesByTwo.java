/*  */

package methods;

public class DividesByTwo {
    static boolean dividesByTwo(int a) {
        return (a % 2 == 0);
    }

    public static void main(String[] args) {
        System.out.println(dividesByTwo(5));
    }
}