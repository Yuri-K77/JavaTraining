package operators.ConditionalOperators;/* Общая форма оператора switch:
switch (проверяемая-переменная){
case значение1:
    код-для-высполнения-при-переменная==значение1;
    break;
case значение2:
    код-для-высполнения-при-переменная==значение2;
    break;
case значение3:
    код-для-высполнения-при-переменная==значение3;
    break;
default:
    код-для-выполнения-если-значение-переменной-не-предусмотрено-в-case;
}
*/

import java.util.Scanner; // импорт сканера

public class OperatorSwitch {
    public static void main(String args[]){
        /*System.out.println("Введите 1, 2, 3 или 4");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        switch (number){
            case 1: System.out.println ("Вы ввели число 1"); break;
            case 2: System.out.println ("Вы ввели число 2"); break;
            case 3: System.out.println ("Вы ввели число 3"); break;
            case 4: System.out.println ("Вы ввели число 4"); break;
            default: System.out.println("Вы ввели неправильное число");*/

        // Задачи на оператор switch:

        //1. Представим, что у нас есть загадка: "Что это такое: синий, большой, с усами и полностью набит зайцами?" Ответ: троллейбус.
        //Представим, что Вы загадываете эту загадку пользователю. Создайте программу, которая будет считывать с консоли ответ:
        //у пользователя есть 3 попытки. После трех ответов программа должна завершиться:
        //если пользователь вводит "Троллейбус", мы выводим в консоль "Правильно!" и выходим из цикла;
        //если пользователь вводит "Сдаюсь", мы выводим в консоль "Правильный ответ: троллейбус." и выходим из цикла;
        //если пользователь вводит любой другой ответ, мы выводим в консоль "Подумай еще." и продолжаем цикл.
        /*String answer;
        boolean exit;
        System.out.println ("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        Scanner inputAnswer = new Scanner (System.in);

        exit = false;
        for(int i = 1; i <= 3; i++){
            if (exit == true)
                break;
            answer = inputAnswer.next ();
            switch (answer){
                case ("Троллейбус"):
                    System.out.println ("Правильно!");
                    exit = true;
                    break;
                case ("Сдаюсь"):
                    System.out.println ("Правильный ответ: троллейбус.");
                    exit = true;
                    break;
                default:
                    System.out.println("Подумай еще.");*/
    }
}