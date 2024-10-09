package in_out.CreateUserData;
import lombok.SneakyThrows;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class UserData {

    public static final File FILE_CSV = new File("src/main/java/InOut/TestDirectory", "UserData.csv");
    public static final File FILE_TXT = new File("src/main/java/InOut/TestDirectory", "UserData.txt");
    public static final StringBuilder STRING_BUILDER = new StringBuilder();

    //Создание нового CSV файла
    public static void createCSVFile() {
            if(!FILE_CSV.exists()) {
            try {
                FILE_CSV.createNewFile();
                System.out.println("CSV файл успешно создан");
            } catch (IOException e) {
                System.out.println("Ошибка создания CSV файла" + e.getMessage());
            }
        }
    }

    //Генерация данных для наполнения файла
    public static List<Object[]> generateUserData() {
        List<Object[]> list = new ArrayList<>();
        Object[] user1 = {1, "Free", 10};
        Object[] user2 = {2, "Paid", 7};
        Object[] user3 = {3, "Trial", 12};
        Object[] user4 = {4, "Blocked", 16};
        Object[] user5 = {5, "Deleted", 24};
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        return list;
    }

    //Запись данных в файл
    public static void writeDataInFile(List<Object[]> data) {
        try (PrintWriter printWriter = new PrintWriter(FILE_CSV)) {

            STRING_BUILDER
                    .append("ID")
                    .append(",")
                    .append("ACCOUNT_TYPE")
                    .append(",")
                    .append("AMOUNT");

            for (Object[] user: data) {
                STRING_BUILDER
                        .append("\n")
                        .append(user[0])
                        .append(",")
                        .append(user[1])
                        .append(",")
                        .append(user[2]);
            }

            printWriter.print(STRING_BUILDER);
        } catch (IOException e) {
            System.out.println("Ошибка записи" + e.getMessage());
        }
    }

    //Чтение данных из файла
//    @SneakyThrows
//    public static void readDataFromFile() {
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_CSV), 1000)) {
//
//            Object string;
//
//            bufferedReader.readLine();
//
//            while ((string = bufferedReader.readLine()) != null) {
//                System.out.println(string);
//            }
//        }
//    }

    //Чтение данных из файла
    @SneakyThrows
    public static void readDataFromFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_CSV), 1000)) {
            bufferedReader.lines().forEach(System.out::println);
        }
    }

    //Создание нового TXT файла
    public static void createTXTFile() {
        if(!FILE_TXT.exists()) {
            try {
                FILE_TXT.createNewFile();
                System.out.println("TXT файл успешно создан");
            } catch (IOException e) {
                System.out.println("Ошибка создания TXT файла" + e.getMessage());
            }
        }
    }

    @SneakyThrows
    public static void readFromCsvToTxt() {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_CSV), 1000);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FILE_TXT), 1000);

        bufferedReader.readLine();

        while (bufferedReader.ready()) {
            bufferedWriter.write(bufferedReader.readLine());
            //bufferedWriter.write("\n");
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}