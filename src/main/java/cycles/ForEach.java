/* Цикл for each :
- это разновидность цикла for;
- используется для перебора элементов массива или коллекции. */

package cycles;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {51, 136, 528};
        for (int i : array) {
            System.out.println(i);
        }
    }
}
