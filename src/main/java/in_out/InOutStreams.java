package in_out;

import java.io.*;

public class InOutStreams {

    public static void main(String[] args) {

        //Чтение потока байтов из файла
        File fileInput = new File("src\\main\\java\\InOut\\TestDirectory", "1.txt");

        try (InputStream is = new FileInputStream(fileInput)) {
            byte[] bytes = new byte[1024];
            int len = is.read(bytes);
            System.out.println("Содержимое: " + new String(bytes));
        } catch (FileNotFoundException e) {
            System.out.println("File не существует");
        } catch (IOException e) {
            System.out.println("Ошибка чтения");
        }

        //Запись потока байтов в файл
        File fileOut = new File("src\\main\\java\\InOut\\TestDirectory", "2.txt");

        try (OutputStream os = new FileOutputStream(fileOut)) {
            String text = "Java the best!";
            os.write(text.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File не существует");
        } catch (IOException e) {
            System.out.println("Ошибка записи");
        }
    }
}
