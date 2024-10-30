/*Метод concat() в Java добавляет одну строку в конец к другой строке*/

public class Concate2 {
    public static void main(String[] args) {
        String sentence ="У меня есть цель на ближайший год. ";
        sentence = sentence.concat("Я должен стать Java разработчиком.");
        System.out.println(sentence);
    }
}