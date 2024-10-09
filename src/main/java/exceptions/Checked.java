/* В Java используются следующие ключевые слова для работы с исключениями:
- try — начало блока кода, который может привести к ошибке;
- catch — начало блока кода обработки исключений;
- finally — начало блока кода, которой выполняется в любом случае;
- throw — служит для генерации исключений;
- throws — обозначает, что метод может выбросить исключение.
Блок try...catch */

package exceptions;

import java.io.*;

public class Checked {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.close();
            fileWriter.write("Hello World");
        } catch (IOException e) {
            System.out.println("Ошибка - Нельзя записать в закрытый файл!");
        }
        System.out.println("Программа работает успешно!");
    }
}
