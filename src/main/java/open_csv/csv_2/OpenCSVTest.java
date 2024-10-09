package open_csv.csv_2;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.List;

public class OpenCSVTest {

    @SneakyThrows
    public static void main(String[] args) {

        //Создание объекта csvreader, чтение данных из файла
        Reader reader = new FileReader("src/main/java/open_csv/csv_2/temperatures_1.CSV");
        CSVReader csvReader = new CSVReader(reader);
        List<String[]> listOfStrings = csvReader.readAll(); //метод readAll считывает файл целиком
        csvReader.readNext(); //метод readNext считывает данные из файла построчно

        csvReader.close();
        reader.close();
//        csvReader.close();

        //Создание объекта csvwriter, запись данных в файл
        Writer writer = new FileWriter("src/main/java/open_csv/csv_2/openCSV_test.CSV");
        CSVWriter csvWriter = new CSVWriter(writer);
        csvWriter.writeAll(listOfStrings); //метод writeAll записывает сведения в файл целиком

        csvWriter.close();
        writer.close();
//        csvWriter.close();
    }
}
