/**
 *  Написать метод, который в качестве аргумента принимает коллекиию(List<Integer>) и далее этот метод
 *  возвращает int значение соответствующее кол-ву нечетных чисел в этой коллекции. Внутри метода все
 *  операции реализовать с помощью api предоставляемого Stream.
 */

package streamAPI.SAPI3;

import java.util.List;


public class StreamAPI3 {

    public static int countAddNumbers(List<Integer> list1) {
        return (int) list1
                .stream()
                .filter(number -> number%2 != 0)
                .count();
    }
}