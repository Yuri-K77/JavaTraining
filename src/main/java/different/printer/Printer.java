package different.printer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Printer {

    public static String consolePrint(String string) {
        //System.out.println(string);
        return string;
    }

    public static boolean filePrint(String filePath, String string) {
        try {
            Writer fileWriter = new FileWriter(filePath);
            fileWriter.write(string);
            fileWriter.close();
            return true;
        } catch (IOException e) {
        return false;
        }
    }
}
