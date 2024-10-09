package serial_deserial.basic;

import java.io.*;

public class WriteObject {
    public static void main(String[] args) {
        //Запись по одному объекту
        Person person1 = new Person(1, "Pete", 23.4);
        Person person2 = new Person(2, "John", 36.9);

        //Запись массива объектов
//        Person [] people = {new Person(1, "Pete", 23.4), new Person(2, "John", 36.9), new Person(3, "Mike", 30.7)};

        try {
            //Вариант 1
            FileOutputStream fos = new FileOutputStream("src/main/java/serial_deserial/basic/people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Вариант 2
            //ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/java/serial_deserial/basic/people.bin")) //используется в блоке try-with-resources,
            //закрывать поток не надо, это делается автоматически

            //Запись по одному объекту
            oos.writeObject(person1);
            oos.writeObject(person2);

            //Запись массива объектов
//            oos.writeObject(people);

            //Запись массива объектов через цикл
//            oos.writeInt(people.length);
//            for (Person person: people) {
//                oos.writeObject(person);
//            }

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
