/* В Checked Ошибках можно обойтись и без блока "try catch", подключив Класс ошибки напрямую к методу зарезервированным словом "throws".
Если метод выбрасывает или может выбросить исключение, которое в методе не обрабатывается, то при описании метода используется оператор throws,
который надо обработать при вызове этого метода. В сигнатуре метода после ключевого слова throws перечисляются классы исключений, которые может выбрасывать метод. */

package exceptions;

import java.io.*;

public class Checked2 {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("out.txt");
        fileWriter.write("Hello World");
        fileWriter.close();

        System.out.println("Программа работает успешно!");
    }
}
