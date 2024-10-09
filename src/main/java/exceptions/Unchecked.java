/* В UNCHECKED можно использовать блок "try catch", если Вы явно видите, что может произойти ошибка. */

package exceptions;

public class Unchecked {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Делить на нуль - нельзя!");
        }
        System.out.println("Программа работает успешно!");
    }


}