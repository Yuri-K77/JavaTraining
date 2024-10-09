package in_out;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


//Главное назначение класса FileOutputStream — запись байтов в файл.
public class FileOutpustream2 {
    public static void main(String[] args) {

        //В конструкторе объект этого класса принимает путь к целевому файлу, в который нужно записать байты
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("src\\main\\java\\InOut\\TestDirectory\\FileOutputstream2.txt");

            //Запись данных несколько раз (boolean append - true)
//            fileOutputStream = new FileOutputStream("src\\main\\java\\InOut\\TestDirectory\\FileOutputstream2.txt", true);
            System.out.println("Файл успешно создан");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка создания файла" + e.getMessage());
        }

        String message = "Just be positive!";

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
