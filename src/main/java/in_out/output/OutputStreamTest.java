package in_out.output;

import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class OutputStreamTest {

    @SneakyThrows
    public static void writeData1() {
        byte[] bytes1 = {72, 101, 108, 108, 111};
        OutputStream outputStream = new FileOutputStream("src/main/java/in_out/output/out1.txt");
        outputStream.write(bytes1);
        outputStream.close();
    }

    @SneakyThrows
    public static void writeData2() {
        byte[] bytes2 = {72, 101, 108, 108, 111};
        byte[] bytes3 = new String(bytes2).getBytes(StandardCharsets.UTF_16BE);
        OutputStream outputStream = new FileOutputStream("src/main/java/in_out/output/out2.txt");
        outputStream.write(bytes3);
        outputStream.close();
    }

    public static void main(String[] args) {

        writeData1();
        writeData2();
    }
}
