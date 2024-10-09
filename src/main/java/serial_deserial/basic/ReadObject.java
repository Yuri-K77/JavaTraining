package serial_deserial.basic;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            //Вариант 1
            FileInputStream fis = new FileInputStream("src/main/java/serial_deserial/basic/people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Вариант 2
            //ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))

            //Считывание по одному объекту
            Person person1 = (Person)ois.readObject();
            Person person2 = (Person)ois.readObject();
            System.out.println(person1);
            System.out.println(person2);

            //Считывание массива объектов
//            Person[] people = (Person[]) ois.readObject();
//            System.out.println(Arrays.toString(people));

            //Считывание массива объектов через цикл
//            int personCount = ois.readInt();
//            Person [] people = new Person[personCount];
//            for (int i = 0; i < personCount; i++) {
//                people [i] = (Person)ois.readObject();
//            }
//            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}