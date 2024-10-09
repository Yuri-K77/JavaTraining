/* Оператор break позволяет прервать выполнение цикла в любой удобный момент - раньше, чем цикл "должен был бы" завершиться.
Основные моменты:
- break вызывается лаконично - просто break и точка с запятой;
- break работает одинаково для всех циклов - while, do...while, for и др.;
- break прерывает выполнение только одного цикла - того, который его непосредственно вызывает;
- break применяется в операторе switch.*/

package operators.TransitionOperators;

import java.util.Scanner; // импорт сканера

public class Brake {
    public static void main(String[] args) {
        int i = 1;
        int a = 3;
        while(i <= 5) {
            System.out.println(i + ": цикл выполняется!");
            if (i == a)
                break;
            i++;
        /*for (int i = 1; i <= 3; i++) { //вложенный цикл
            System.out.println("Это первый цикл! Я выполняюсь " + i + "-й" + " раз");
            for (int a = 1; a <= 10; a++) {
                System.out.println("    Это второй (вложенный) цикл! Я выполняюсь " + a + "-й" + " раз");
                if (a == 3)
                    break;
            }*/
        /*System.out.println("Введите 1, 2, 3 или 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number){
            case 1: System.out.println ("Вы ввели число 1"); break;
            case 2: System.out.println ("Вы ввели число 2"); break;
            case 3: System.out.println ("Вы ввели число 3"); break;
            case 4: System.out.println ("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели неправильное число");*/
        }
    }
}