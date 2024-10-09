/* Чтобы объявить и использовать лямбда-выражение, основная программа разбивается на ряд этапов:
- определение ссылки на функциональный интерфейс:
Operation operation1
- Создание лямбда-выражения:
(x, y) -> x + y;
- использование лямбда-выражения в виде вызова метода интерфейса:
int result1 = operation1.calculate(5, 6);
 */

package funcInterfaceLambda.Lambda3;

public class Main {
    public static void main(String[] args) {
        //Нетерминальное лямбда выражение - возвращает значение
        System.out.println("Это нетерминальные лямбда-выражения, которые возвращают результаты расчётов:");

        Operation operation1 = (x, y) -> x + y;
        int result1 = operation1.calculate(5, 6);
        System.out.println("Сложение: " + result1);
        System.out.println("Сложение: " + operation1.calculate(7,9));

        Operation operation2 = (x, y) -> x - y;
        int result2 = operation2.calculate(20, 14);
        System.out.println("Вычитание: " + result2);
        System.out.println("Вычитание: " + operation2.calculate(35, 21));

        Operation operation3 = (x, y) -> x * y;
        int result3 = operation3.calculate(23, 45);
        System.out.println("Умножение: " + result3);
        System.out.println("Умножение: " + operation3.calculate(23, 4));

        //Терминальное лямбда выражение - не возвращает никакого значения
        Printable printable = str -> System.out.println(str);
        printable.print("\n" + "Это терминальное лямбда-выражение, которое ничего не возвращает");
    }
}
