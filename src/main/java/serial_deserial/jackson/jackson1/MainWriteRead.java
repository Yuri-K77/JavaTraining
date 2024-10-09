package serial_deserial.jackson.jackson1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MainWriteRead {
    public static void main(String[] args) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        //Сериализация объектов в JSON:
        //1.Простой объект
        User person = new User(1, "Linus", "Torwalds");

        //2.Массив данных
//        User personArray = new User();
//        personArray.setArray(new int[] {1,2,3,4,5});

        //3.Объект вложенного типа
//        User person = new User();
//        InnerObject innerObject = new InnerObject();
//        innerObject.setParam1("Jackson");
//        innerObject.setParam2("library");
//        person.setInnerObject(innerObject);

        //Сериализация объектов в JSON:
        String writeToJson = objectMapper.writeValueAsString(person);
        System.out.println(writeToJson);

        //Десериализация из JSON в объект:
        User readFromJson = objectMapper.readValue(writeToJson, User.class);
        System.out.println(readFromJson.getClass());
    }
}
