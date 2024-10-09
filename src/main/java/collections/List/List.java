/* List - это структура данных (интерфейс), которая представляет функциональность простых списков.
Расширяет интерфейс Collection.

Виды List:
- ArrayList
- LinkedList
- Vector

Синтаксис (в скобках задаётся тип данных, который будет храниться в списке):
ArrayList<String> myArrayList = new ArrayList<String>();
LinkedList<String> myLinkedList = new LinkedList<String>();
 */

package collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class List {
    public static void main(String[] args) {

        ArrayList<String> myArrayList = new ArrayList<String>();
        LinkedList<String> myLinkedList = new LinkedList<String>();

        //add() добавление элемента
        myArrayList.add("We add an element to ArrayList!");
        myLinkedList.add("We add an element to LinkedList!");

        //проход по списку
        myArrayList.add("Hey!");
        myArrayList.add("This");
        myArrayList.add("is");
        myArrayList.add("my");
        myArrayList.add("first");
        myArrayList.add("list!");
        for (int i = 0; i < myArrayList.size(); i++)
        System.out.println(myArrayList.get(i));

        //remove(0) удаление элемента по индексу
        //remove("Hey!") удаление элемента по ссылке
        myArrayList.add("Hey!");
        myArrayList.add("This");
        myArrayList.add("is");
        myArrayList.add("my");
        myArrayList.add("first");
        myArrayList.add("list!");
        //myArrayList.remove(0);
        myArrayList.remove("Hey!");
        for (int i = 0; i < myArrayList.size(); i++)
        System.out.println(myArrayList.get(i));

        String[] javaClass = {"Andrey", "Margo", "Olga", "Lizaveta", "Maksim", "Stanislava", "Yuri"};

        java.util.List<Integer> updateJavaClass = new ArrayList<>();

        for (int i = 0; i < javaClass.length; i++) {
            updateJavaClass.add(0, javaClass.length);
            System.out.println(updateJavaClass.size());
        }

        System.out.println(updateJavaClass.get(1));

        //Список фиксированного размера - преобразование массива в ArrayList, используя Arrays.asList
        java.util.List newJavaClass = Arrays.asList(javaClass);
        System.out.println(newJavaClass);

//        //Попытка добавления большего количества элементов вызовет UnsupportedOperationException
//        newJavaClass.add("Sergei");
//        newJavaClass.add("Nikolai");
//        System.out.println(newJavaClass);

        //Изменяемый размер списка - создать новый ArrayList и передать Arrays.asList (ссылка на массив)
        // в качестве аргумента (то есть в качестве аргумента конструктора ArrayList)
        java.util.List<String> newJavaClass1 = new ArrayList<String>(Arrays.asList(javaClass));
        System.out.println("\n" + newJavaClass1);
        //Добавляем еще несколько значений в список
        newJavaClass1.add("Elena");
        newJavaClass1.add("Ivan");
        System.out.println("ArrayList after adding two new elements: " + newJavaClass1);

        //Изменяемый размер списка - преобразование массива в ArrayList, используя Collections.addAll()
        java.util.List<String> newJavaClass2 = new ArrayList<String>();
        Collections.addAll(newJavaClass2, javaClass);
        System.out.println("\n" + newJavaClass2);
        //Добавляем еще несколько значений в список
        newJavaClass2.add("Sergei");
        newJavaClass2.add("Ekaterina");
        System.out.println("ArrayList after adding two new elements: " + newJavaClass2);

    }
}
