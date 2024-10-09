package in_out.input;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReaderTest {

    @SneakyThrows
    public static String readData() {
        StringBuilder stringBuilder = new StringBuilder();
        FileReader fileReader = new FileReader("src/main/java/in_out/output/out1.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        bufferedReader.lines().forEach(line->stringBuilder.append(line).append("\n"));
        stringBuilder.setLength(stringBuilder.length()-1);
        fileReader.close();
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

        System.out.println(readData());
    }
}
