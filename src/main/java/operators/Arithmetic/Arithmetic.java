package operators.Arithmetic;/* Арифметические операторы */

public class Arithmetic {
    public static void main(String[] args) {
        int k = 70;
        int p = 10;
        int f = 5;
        int m = k + p;
        System.out.println(m);

        m -= 30;
        System.out.println(m);

        int s = m * f;
        System.out.println(s);

        s = s / f;
        System.out.println(s);
    }
}