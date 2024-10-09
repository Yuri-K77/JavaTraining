/* Необходимо написать метод, который бы возводил число в степень. И далее два числа, возведенные в степень,
должны быть просуммированы, а результат выведен в консоль. */

package methods;

public class Exponentiation {
    static int power(int a, int b){
        int result = 1;
        for (int i=1; i<=b; i++){
            result = result*a;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println( power(3,2) + power(2,6));
    }
}
