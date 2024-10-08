package different.printer;

import static different.printer.Printer.consolePrint;
import static different.printer.Printer.filePrint;

public class Main {

    public static void main(String[] args) {

        System.out.println(consolePrint("Hello, JAVA"));

        System.out.println(filePrint("src/main/java/different/printer/printer_test.txt", "JAVA is great!"));

        System.out.println(filePrint("src/main/java/different/printer1/printer_test.txt", "JAVA is great!"));
    }
}
