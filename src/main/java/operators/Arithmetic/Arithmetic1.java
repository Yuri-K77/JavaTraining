package operators.Arithmetic;/* Сокращённые арифметические операторы:
m += 7;  это всё равно, что m = m+7;
m -= 7 ; это всё равно, что m = m-7;
m*= 7; это всё равно, что m = m*7;
m/= 7; это всё равно, что m = m/7; */

public class Arithmetic1 {
    public static void main(String[] args) {
        int m = 2;
        m += 7;
        System.out.println(m);

        m -= 5;
        System.out.println(m);

        m *= 5;
        System.out.println(m);

        m /= 2;
        System.out.println(m);

        m %= 3;
        System.out.println(m);
    }
}