/* Queue - это структура данных (интерфейс), которая представляет функционал для структур данных в виде очереди.
Расширяет интерфейс Collection.

Виды Queue:
- Queue - однонапрвленная очередь
-Dequeue - двунаправленнная очередь
- PriorityQueue - очередь с приоритетом
*/

package collections.Queue;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        PriorityQueue<Integer> myPriorityQueue = new PriorityQueue<Integer>();

        //add() - добавляем элемент в конец очереди. (Поправка: если очередь с приоритетом -
        //т.е. PriorityQueue - элемент ставится необязательно в конец, а в соответствии со своим приоритетом):
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for (int i : myPriorityQueue)
        System.out.println(i);

        //remove() удалить первый элемент очереди
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for(int i: myPriorityQueue)
        System.out.println(i);
        myPriorityQueue.remove();
        System.out.println("After removing:");
        for(int i: myPriorityQueue)
        System.out.println(i);

        //poll() удалить первый элемент очереди
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for(int i: myPriorityQueue)
        System.out.println(i);
        myPriorityQueue.poll();
        System.out.println("After removing:");
        for(int i: myPriorityQueue)
        System.out.println(i);

        //remove(Object o) убрать любой элемент, не только сверху
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        for(int i: myPriorityQueue)
        System.out.println(i);
        myPriorityQueue.remove(2);
        System.out.println("After removing:");
        for(int i: myPriorityQueue)
        System.out.println(i);

        //offer() пытается вставить в конец очереди
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        myPriorityQueue.offer(22);
        for(int i: myPriorityQueue)
        System.out.println(i);

        //peek() показывает верхний элемент очереди
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        System.out.println(myPriorityQueue.peek());

        //element() показывает верхний элемент очереди
        myPriorityQueue.add(1);
        myPriorityQueue.add(2);
        myPriorityQueue.add(3);
        System.out.println(myPriorityQueue.element());
    }
}