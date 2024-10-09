package in_out.input;

import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class InputStreamTest {

    @SneakyThrows
    public static byte[] readData() {
        byte[] bytes;
        FileInputStream fileInputStream = new FileInputStream("src/main/java/in_out/output/out2.txt");
        bytes = fileInputStream.readAllBytes();
        fileInputStream.close();
        return bytes;
    }

    public static void main(String[] args) {

        System.out.println(new String(readData(), StandardCharsets.UTF_16BE));
    }
}
