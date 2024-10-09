/* Set - это структура данных (интерфейс), которая используется для хранения множеств уникальных объектов.
Расширяет интерфейс Collection.

Виды Set:
- HashSet хранит элементы в произвольном порядке, но зато быстро ищет. Подходит, если порядок Вам не важен, но важна скорость.
Более того, для оптимизации поиска, HashSet будет хранить элементы так, как ему удобно.
- LinkedHashSet будет хранить элементы в порядке добавления, но зато работает медленнее.
- TreeSet хранит элементы отсортированными.

Синтаксис (необходимо указывать тип данных, которые находятся в множестве):
HashSet<String> myHashSet = new HashSet<String>();
*/

package collections.Set;

import java.util.HashSet;

public class Set {
    public static void main(String[] args) {

        HashSet<Integer> myHashSet = new HashSet<Integer>();

        //add() - добавляет элемент в множество
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        for (int i : myHashSet)
        System.out.println(i);

        //remove() - удаляет элемент из множества
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println("Before remove:");
        for (int i : myHashSet)
        System.out.println(i);

        myHashSet.remove(1);
        System.out.println("After remove:");
        for (int i : myHashSet)
        System.out.println(i);

        //contains() - определяет, есть ли элемент в множестве
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println("Does myHashSet contain '1'? " + myHashSet.contains(1));
        System.out.println("Does myHashSet contain '11'? " + myHashSet.contains(11));

        //size() - возвращает размер множества
        System.out.println("Before we add anything myHashSet size is " + myHashSet.size());
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println("Now myHashSet size is " + myHashSet.size());

        //clear() - удаляет все элементы из коллекции
        System.out.println("Before we add anything myHashSet size is " + myHashSet.size());
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println("Now myHashSet size is " + myHashSet.size());
        myHashSet.clear();
        System.out.println("After clear myHashSet size is " + myHashSet.size());

        //isEmpty() - возвращает true если множество пустое, и false если там есть хотя бы один элемент
        System.out.println("At the beginning myHashSet is empty: " + myHashSet.isEmpty());
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);
        System.out.println("After adding elements myHashSet is empty: " + myHashSet.isEmpty());
        myHashSet.clear();
        System.out.println("After clear myHashSet is empty: " + myHashSet.isEmpty());
    }
}
