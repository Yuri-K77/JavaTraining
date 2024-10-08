/* Деление по модулю даёт остаток от деления:
- Byte, short, Int, long – целочисленный тип переменных
- Float, Double – числа с плавающей точкой
- Отрицательные и положительные числа */

package operators.Arithmetic;

public class DivisionByModulus {

    public static void main(String[] args) {

        int n = 9;
        int k = 4;
        int m = n % k;
        System.out.println(m);

        double a = 7.6;
        double b = 2.9;
        double c = a % b;
        System.out.println(c);
    }
}