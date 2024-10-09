/** Необходимо сделать метод, который в качестве аргумента принимает List<Integer>. Метод должен
 * возвращать List<Humans>. Где каждый элемент в коллекции которая передается в метод как аргумент
 * будет являться для объекта Human его полем возвраст, которое сетается через его конструктор. Внутри метода
 * все операции через Stream api. Т. е. передали в метод такие последовательности 1, 2, 3, 4, 5, а на выходе
 * получили [Human{age=1}, Human{age=2}, Human{age=3}, Human{age=4}, Human{age=5}].
 *
 * Создать метод, который в качестве аргумента принимает результат выполнения метода п.2. А возвращать этот
 * метод должен коллекцию List<Integer>, которая является возрастами каждого объекта Human. Т.е. скормили коллекцию
 * с типом Human в метод, а на выходе получили [1, 2, 3, 4, 5].
*/


package streamAPI.SAPI4;

import java.util.ArrayList;
import java.util.List;

import static streamAPI.SAPI4.Human.makeAges;
import static streamAPI.SAPI4.Human.makeHumans;


public class Main {

    public static void main(String[] args) {

        List<Integer> ages = new ArrayList<>();
        ages.add(1);
        ages.add(2);
        ages.add(3);
        ages.add(4);
        ages.add(5);

        List<Human> humans = makeHumans(ages);
        System.out.println(humans);

        System.out.println(makeAges(humans));
    }
}