/* Вывод двумерного массива с помощью цикла for сильно отличается от вывода обычного массива (когда используется цикл for).
Чтобы вывести в каждую ячейку двумерного массива значение, недостаточно использовать один цикл for. Необходимо использовать
два цикла for, при этом один из них находится в другом. */

package arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        int[][] array = new int[2][2];

        array[0][0] = 1;
        array[0][1] = 2;
        array[1][0] = 3;
        array[1][1] = 4;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
