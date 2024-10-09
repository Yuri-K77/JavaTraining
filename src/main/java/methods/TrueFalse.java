/* Напишите метод, который бы возвращал в консоль:
- true, если число больше 5
- false, если число меньше 5 */

package methods;

public class TrueFalse {
    static boolean moreThanFive(int a){
        if (a > 5) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println( moreThanFive(2) );
    }
}
