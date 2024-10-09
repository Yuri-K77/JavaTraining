/* Map - это структура данных (интерфейс), в которой объекты хранятся не по одному, как во всех остальных, а в паре "ключ - значение".
В отличие от других интерфейсов коллекций не наследуется от интерфейса Collection.

Виды Map:
- HashMap - хранит значения в произвольном порядке, но позволяет быстро искать элементы карты. Позволяет задавать ключ или значение ключевым словом null.
- LinkedHashMap - хранит значения в порядке добавления.
- TreeMap - сама сортирует значения по заданному критерию. TreeMap используется либо с Comparable элементами, либо в связке с Comparator.
- Hashtable - как HashMap, только не позволяет хранить null и синхронизирован с точки зрения многопоточности - это значит, что много потоков
могут работать безопасно с Hashtable. Но данная реализация старая и медленная, поэтому сейчас уже не используется в новых проектах.

Синтаксис (необходимо
n задавать два типа - тип ключа и тип значения):
HashMap<String, Integer> myHashMap = new HashMap<String, Integer>();
*/


package collections.Map;

import java.util.HashMap;


public class Map {
    public static void main(String[] args) {

        HashMap<String, String> myHashMap = new HashMap<String, String>();

        //put(K key, V value) - добавляем элемент в карту
//        myHashMap.put("Basil", "07.12.1987");
//        myHashMap.put("Kate", "12.10.1971");
//        myHashMap.put("Lena", "11.01.1991");
//        for(HashMap.Entry<String, String> entry: myHashMap.entrySet());
//        System.out.println(entry.getKey() + " - " + entry.getValue());

        //get(Object key) - ищем значение по его ключу
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        System.out.println("The value for 'Basil' is " + myHashMap.get("Basil"));

        //remove(Object key) - удаляем значение по его ключу
//        myHashMap.put("Basil", "07.12.1987");
//        myHashMap.put("Kate", "12.10.1971");
//        myHashMap.put("Lena", "11.01.1991");
//
//        System.out.println("Before removing a key:");
//        for(Map.Entry<String, String> entry: myHashMap.entrySet());
//        System.out.println(entry.getKey() + " - " + entry.getValue());
//
//        myHashMap.remove("Kate");
//        System.out.println("\nAfter removing the key:");
//        for(Map.Entry<String, String> entry: myHashMap.entrySet());
//        System.out.println(entry.getKey() + " - " + entry.getValue());

        //containsKey(Object key) - спрашиваем, есть ли в карте заданный ключ
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        System.out.println("Do we have 'Basil'? " + myHashMap.containsKey("Basil"));
        System.out.println("Do we have 'Victoria'? " + myHashMap.containsKey("Victoria"));

        //containsValue(Object value) - спрашиваем, есть ли в карте заданное значение
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        System.out.println("Do we have a value'12.10.1971'? " + myHashMap.containsValue("12.10.1971"));
        System.out.println("Do we have a value 'lalala'? " + myHashMap.containsValue("lalala"));

        //size() - возвращает размер карты (количество пар "ключ-значение")
        myHashMap.put("Basil", "07.12.1987");
        myHashMap.put("Kate", "12.10.1971");
        myHashMap.put("Lena", "11.01.1991");
        System.out.println("The size of map is " + myHashMap.size());
    }
}
