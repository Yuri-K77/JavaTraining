/* Общая форма условного оператора if:
if (условие) {
//действие(-я), которые выполняются, если условие истинно;
}
else if (условие) {
//действие(-я), которые выполняются, если условие истинно;
}
else if (условие) {
//действие(-я), которые выполняются, если условие истинно;
}
else {
//действие(-я), которые выполняются, если условие истинно;
}
 */

package operators.ConditionalOperators;

import java.util.Scanner; // подключаем сканер

public class OperatorIf {
    public static void main(String[] args) {
        System.out.print("Введите число 1, 2 или 3: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        if (i == 1) {
            System.out.println("Вы ввели число 1");
        } else if (i == 2) {
            System.out.println("Вы ввели число 2");
        } else if (i == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }

        /*System.out.print ("Введите число 1: ");
        Scanner inputFigure = new Scanner (System.in);
        int i = inputFigure.nextInt ();
        if ( i==1) {
            System.out.println ("Вы ввели число 1");
        }
        else {
            System.out.println ("Вы ввели число не равное 1");*/

        /*System.out.print("Введите число 1: ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();
        if (i == 1) {
            System.out.println("Вы ввели число 1");
        }*/
    }
}