package serial_deserial.human;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    private  static final  String FILE_PATH = "src/main/java/serial_deserial/human/file.txt";

    @SneakyThrows
    public static void main(String[] args) {

        Human1 human = new Human1("Bob", "NY");

        //сериализация объекта в файл
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        oos.writeObject(human);
        oos.close();

        //десериализация строковых данных из файла в объект типа Human
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
        Human1 obj = (Human1)ois.readObject();
        ois.close();

        System.out.println(obj.toString());
        System.out.println(obj.name);
        System.out.println(obj.address);
    }
}
