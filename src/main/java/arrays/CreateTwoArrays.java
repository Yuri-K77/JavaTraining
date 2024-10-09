package arrays;

public class CreateTwoArrays {
    public static void main(String[] args) {

//        //1. Инициализация массива
//        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        //Выведение длины массива
//        int a = array1.length;
//        System.out.println(a);
//        //Выведение элементов массива
//        for (int i = 0; i < array1.length; i++) {
//            System.out.print(" " + array1[i]);
//        }

//        //2. Инициализация массива
//        int[] array2 = new int[11];
//        array2[0] = 0;
//        array2[1] = 1;

        System.out.print("Вывод элементов массива через цикл for each: ");
        int[] array2 = {1, 0, -6, 2, 4};
        for (int i: array2) {
            System.out.print(i + ", ");
        }

        System.out.print("\n" + "Инициализация массива через цикл for: ");
        int[] array1 = new int[21];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i * 2;
            System.out.print(array1[i] + ", ");
        }

        System.out.print("\n" + "Создание второго массива из чётных элементов первого массива: ");
        for (int i = 0; i < array1.length; i++) {
            if(i%2 == 0)
            System.out.print(array1[i] + ", ");
        }

        System.out.print("\n" + "Создание третьего массива из нечётных элементов первого массива: ");
        for (int i = 0; i < array1.length; i++) {
            if(i%2 != 0)
                System.out.print(array1[i] + ", ");
        }
    }
}