/*
1) создать класс, который имеет метод возвращающий Object[], с набором данных int id, String accountType, int amount.
Сколько конкретно генерить таких массивов - вам решать и какими данными их наполнять. Присваивать можно через конструктор или любым иным способом.

2) создать CSV файл куда впихнуть построчно данные для каждой сущности. Сделать заголовок типа: ID, ACCOUNT_TYPE, AMOUNT.

3) получить эти данные из файла CSV и перезаписать их в txt файл, но уже без заголовка - только строки с сущностями.
*/

package in_out.CreateUserData;

import static in_out.CreateUserData.UserData.*;


public class Main {
    public static void main(String[] args) {
        createCSVFile();
        writeDataInFile(generateUserData());
        readDataFromFile();
        createTXTFile();
        readFromCsvToTxt();
    }
}