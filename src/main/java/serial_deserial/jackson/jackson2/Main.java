/** Библиотека Jackson для работы с сериализацией / десериализацией объектов в JSON */

package serial_deserial.jackson.jackson2;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        var path = "src/main/java/serial_deserial/jackson/jackson2/userData.json";

        //Инициализация через ObjectMapper
        ObjectMapper objectMapper = new ObjectMapper();

        //Сериализация данных объекта в файл (JSON формат)
        objectMapper.writeValue(new File(path), new UserClass("Bob", 32, "New York"));

        //Десериализация данных из файла в JAVA объект
        UserClass user1 = objectMapper.readValue(new File(path), UserClass.class);
        System.out.println(user1);
        System.out.println("User name: " + user1.userName + ", " + "user age " + user1.userAge + ", " + "user address " + user1.userAddress);
        System.out.println(user1.userName);
        System.out.println(user1.userAge);
        System.out.println(user1.userAddress);
        user1.print();

        //Десериализация данных из строки в JAVA объект
        String jsonString = "{\"userName\":\"Bill\",\"userAge\":28,\"userAddress\":\"Maiami\"}";

        UserClass user2 = objectMapper.readValue(jsonString, UserClass.class);
        System.out.println("\n" + user2);
        System.out.println(user2.userName);
        System.out.println(user2.userAge);
        System.out.println(user2.userAddress);
        user2.print();
    }
}