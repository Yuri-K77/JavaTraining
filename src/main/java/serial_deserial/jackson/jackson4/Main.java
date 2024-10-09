package serial_deserial.jackson.jackson4;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;

import java.io.File;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();

        Weather weather = objectMapper.readValue(new File("src/main/java/serial_deserial/Jackson/Jackson4/file1.json"), Weather.class);

        City city = objectMapper.readValue(new File("src/main/java/serial_deserial/Jackson/Jackson4/file2.json"), City.class);

        weather.setCity(city);

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("src/main/java/serial_deserial/Jackson/Jackson4/file3.json"), weather);
    }
}
