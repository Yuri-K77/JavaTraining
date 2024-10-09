package in_out;

import java.io.File;

public class CreateFileDir {

    public static final String PATH = "src\\main\\java\\InOut\\TestDirectory";

    public static void main(String[] args) {

        File dir = new File(PATH);

        //Проверка наличия директории
        if (dir.exists()) {
            System.out.println("Папка существует");
        } else {
            System.out.println("Папка не существует");
        }

        //Проверка количества файлов в папке
        File[] fileArray = dir.listFiles();
        if (fileArray == null) {
            System.out.println("Папка пустая");
            //return;
        }

        for (File file: fileArray) {
            System.out.println(file.getName());
            if(file.isDirectory()) {
                System.out.println("Это папка");
            }
        }

//        //Создание новой директории
//         File newDir = new File(dir,"New dir1");
//            if(!newDir.exists()) {
//                newDir.mkdir();
//            }

         //Удаление созданной директории
//        File newDir = new File(dir,"New dir1");
//        if(newDir.exists()) {
//            newDir.delete();
//        }

        //Создание нового файла
//        File newFile = new File(dir, "New 4.txt");
//        if(!newFile.exists()) {
//            try {
//                newFile.createNewFile();
//            } catch (IOException e) {
//                System.out.println("Ошибка создания файла" + e.getMessage());
//            }
//        }

        //Удаление созданного файла
        File newFile = new File(dir, "New 4.txt");
        if(newFile.exists()) {
            newFile.delete();
        }
    }
}
