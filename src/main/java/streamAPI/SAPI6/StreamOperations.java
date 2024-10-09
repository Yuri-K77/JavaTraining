/** Основные операции со стримами */

package streamAPI.SAPI6;

import lombok.SneakyThrows;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {

    //преобразование каждого элемента стрима map
    public static Stream streamElementMapping() {
        return Stream.of(1, 2, 3, 4)
                .map(i -> i - 1);
    }

    //foreach
    public static void foreachStream() {
        streamElementMapping()
                .forEach(i -> System.out.println(i));
    }

    //фильтрация
    public static Stream streamFiltering() {
        return Stream.of(1, 2, 3, 4)
                .filter(i -> i%2 != 0);
    }

    //получить результат перемножения всех элементов стрима
    public static int getResultOfMultiplication() {
        return Stream.of(1, 2, 3, 4)
                .reduce((left, right) -> left * right)
                .get();
    }

    //преобразование стрима в List
    public static List<String> getListFromStream() {
        return Stream.of("Bob", "Alice", "Jack")
                .collect(Collectors.toList());
    }

    //преобразование стрима в Map
//    public static Map<String,String> getMapFromStream() {
//        Stream<UserList> userStream = Stream
//                .<>builder
//                .add(new UserList(23,"male", "Mike"))
//                .add(new UserList(36, "female", "Ann"))
//                .add(new UserList(40, "male", "Nick"))
//                .build();
//
//        return userStream.collect(Collectors.toMap(
//                userList -> userList.getName(), //определили ключ
//                userList -> String.format("Age: %d\nSex: %s", userList.getAge(), userList.getSex()) //определили значение
//        ));
//    }

    public static void streamTerminalOperation() {
        Stream<String> stream = Stream.of("Alice", "Jack", "Pete");
        stream.count(); //терминальная операция для объекта стрим
    }

    @SneakyThrows
    public static void main(String[] args) {

        //System.out.println(foreachStream());

        System.out.println(streamFiltering());

        System.out.println(getResultOfMultiplication());

        System.out.println(getListFromStream());

        System.out.println();

        //System.out.println(getMapFromStream());

        //System.out.println(streamTerminalOperation());
    }
}

