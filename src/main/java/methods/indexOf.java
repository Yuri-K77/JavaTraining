/* Метод indexOf() ищет в строке заданный символ или строку, и их возвращает индекс (т.е. порядковый номер).
Метод:
- возвращает индекс, под которым символ или строка первый раз появляется в строке;
- возвращает (-1) если символ или строка не найдены. */

package methods;

public class indexOf {
    public static void main(String[] args) {
        String hello = "Hello";
        int index1 = hello.indexOf('H');
        int index2 = hello.indexOf('o');
        int index3 = hello.indexOf('W');
        System.out.println("Мы ищем букву 'H' в строке "+hello+". Индекс данной буквы: "+index1 );
        System.out.println("Мы ищем букву 'o' в строке "+hello+". Индекс данной буквы: "+index2 );
        System.out.println("Мы ищем букву 'W' в строке "+hello+". Индекс данной буквы: "+index3 );
    }
}
