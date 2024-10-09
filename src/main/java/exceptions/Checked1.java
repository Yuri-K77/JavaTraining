/* Блок try...catch...finally */

package exceptions;

import java.io.*;

public class Checked1 {
    public static void main(String[] args) {
        /*try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.write("Hello World");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ошибка - Нельзя записать в закрытый файл!");
        }finally {
            System.out.println("Выполняюсь всегда!");
        }
        System.out.println("Программа работает успешно!");*/

        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.close();
            fileWriter.write("Hello World");
        } catch (IOException e) {
            System.out.println("Ошибка - Нельзя записать в закрытый файл!");
        }finally {
            System.out.println("Выполняюсь всегда!");
        }
        System.out.println("Программа работает успешно!");
    }
}
