package in_out;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;


//Главное назначение класса FileInputStream — чтение байтов из файла
public class FileInputstream {
    public static void main(String[] args) throws IOException {

        Date date = new Date();

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/main/java/in_out/TestDirectory/1.txt");
            System.out.println("Данные успешно прочитаны из файла" + "\n");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения из файла" + e.getMessage());;
        }

        int i;

        while((i=fileInputStream.read())!= -1) {

            System.out.print((char) i);
        }

        Date date1 = new Date();

        System.out.println("\n" + "\n" + "Время чтения информации из файла: " + (date1.getTime() - date.getTime()) + " миллисекунд");
    }
}