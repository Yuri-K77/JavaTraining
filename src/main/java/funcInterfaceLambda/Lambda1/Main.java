package funcInterfaceLambda.Lambda1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //Реализация по старому через анонимный класс
        Printer printer = new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            }
        };
        printer.print("Printer");

        //Реализация по новому через лямбда выражения (терминальное выражение)
        Printer lamdaPrinter = message -> System.out.println(message);
        lamdaPrinter.print("\n" + "Lambda Printer");

        //Реализация через метод reference()
        Printer methodReferencePrinter = System.out::println;
        methodReferencePrinter.print("\n" + "Method Reference Printer");

        //Дополнительные реализации лямбда выражений
        Map<String, Printer> printerHub = new HashMap<>();
        printerHub.put("Lambda", lamdaPrinter);
        printerHub.put("second", message ->{
                System.out.println("\n" + "-=-=-");
                System.out.println(message);
                System.out.println("-=-=-");
        });
        printerHub.get("Lambda").print("Super!");
    }
}
