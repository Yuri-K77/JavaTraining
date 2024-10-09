/* Необходимо написать метод, который бы возвращал из 2 чисел меньшее число.
Например, из двух чисел 7 и 3 метод должен вывести в консоль 3. */

package methods;

public class MinNumber {
    static int minNumberPrint(int a, int b){
            if (a>b){
                return b;
            }
            else{
                return a;
            }
        }

        public static void main(String[] args){
            System.out.println( minNumberPrint(7,3) );
    }
}
