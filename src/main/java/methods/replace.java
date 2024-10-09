/* Метод replace() заменяет указанный символ (или подстроку) в строке на новый */

package methods;

public class replace {
    public static void main(String[] args) {
        String oldString = "ABC";
        String newString =  oldString.replace('A', 'B');
        System.out.println("Old string: " + oldString);
        System.out.println("New string: " + newString);
    }
}
