package in_out;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//Главное назначение класса FileOutputStream — запись байтов в файл
public class FileOutputstream1 {
    public static void main(String[] args){

        //В конструкторе объект этого класса принимает объект класса File
        File file = new File("src\\main\\java\\InOut\\TestDirectory\\FileOutputstream1.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            System.out.println("Файл успешно создан");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка создания файла" + e.getMessage());
        }

        String message = "Never stop learning!";

        try {
            fileOutputStream.write(message.getBytes());
            System.out.println("Строка успешно записана в файл");
        } catch (IOException e) {
            System.out.println("Файл для записи не найден" + e.getMessage());;
        }

        try {
            fileOutputStream.close();
            System.out.println("Поток успешно закрыт");
        } catch (IOException e) {
            System.out.println("Ошибка закрытия потока" + e.getMessage());;
        }
    }
}