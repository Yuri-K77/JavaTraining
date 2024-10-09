package jdbc;

import com.opencsv.CSVReader;
import jdbc.generatedTestData.TestDataGenerator;
import jdbc.generatedTestData.dto.Day;
import jdbc.generatedTestData.dto.Weather;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.io.FileWriter;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;


public class DBTest {

    @SneakyThrows
    public static void main(String[] args) {

        String response = TestDataGenerator.getResponse();

        List<Day> dayList = TestDataGenerator.parse(response, Weather.class).getDays();

        DBConnector dbConnector = new DBConnector();
        dbConnector.getConnection();
        Statement statement = dbConnector.getStatement();

        SQLExecutor sqlExecutor = new SQLExecutor(statement);
        //sqlExecutor.createTable();
        sqlExecutor.clearTable();
        sqlExecutor.insertDataIntoTable(dayList);
        ResultSet resultSet = sqlExecutor.getResultSet();

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append("average").append(",")
                .append("average_max").append(",")
                .append("average_min").append(",")
                .append("record_max").append(",")
                .append("record_min")
                .append("\n");

        while (resultSet.next()) {
            stringBuilder.append(resultSet.getString("average")).append(",");
            stringBuilder.append(resultSet.getString("average_max")).append(",");
            stringBuilder.append(resultSet.getString("average_min")).append(",");
            stringBuilder.append(resultSet.getString("record_max")).append(",");
            stringBuilder.append(resultSet.getString("record_min"));
            stringBuilder.append("\n");
        }
        stringBuilder.setLength(stringBuilder.length() - 1);//delete the last symbol --> "\n"

        FileWriter fileWriter = new FileWriter("src/main/java/jdbc/generatedTestData/temperatures.CSV");
        fileWriter.write(stringBuilder.toString());
        fileWriter.close();

        //HW

        //Clear table
        sqlExecutor.clearTable();

        //Read from CSV file
        FileReader filereader = new FileReader("src/main/java/jdbc/generatedTestData/temperatures.CSV");
        CSVReader csvReader = new CSVReader(filereader);
        List<String[]> allRows = csvReader.readAll();
//        for(String[] row : allRows){
//            System.out.println(Arrays.toString(row));
//        }
        csvReader.close();
        filereader.close();

        //Write to DB
        sqlExecutor.insertDataIntoTable2(allRows);

        dbConnector.closeStatement();
        dbConnector.closeConnection();
    }
}