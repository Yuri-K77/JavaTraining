package in_out.output;

import lombok.SneakyThrows;

import java.io.FileWriter;
import java.io.Writer;

public class WriteTest {

    @SneakyThrows
    public static void writeData() {
        Writer writer = new FileWriter("src/main/java/in_out/output/out3.txt");
        writer.write("Hello, JAVA");
        writer.close();
    }

    public static void main(String[] args) {

        writeData();
    }
}