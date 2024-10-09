/* Метод toCharArray() создает из строки массив чаров (от англ. - char) */

package arrays;

public class toCharArray {
    public static void main(String[] args) {
        String str = "ABC";
        char[] result = str.toCharArray();
        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++)
            System.out.println("Element [" + i + "]: " + result[i]);
    }
}