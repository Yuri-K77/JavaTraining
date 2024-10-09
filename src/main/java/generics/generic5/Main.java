/* Реализация обобщённого метода */

package generics.generic5;

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer();
        String[] people = {"Tom", "Alice", "Sam", "Kate", "Bob", "Helen"};
        Integer[] numbers = {23, 4, 5, 2, 13, 456, 4};
        printer.print(people);
        printer.print(numbers);
    }
}
