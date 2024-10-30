/* Сканер - используется, если что-то ввели в консоли, а нам надо считать что же именно ввели.
Методы сканера:
- next () - считывает введенное пользователем слово или фразу с консоли до первого пробела;
- nextLine () - отвечает за то считывание введенного пользователем слова или фразы с консоли;
- nextInt () - отвечает за то, чтобы считать введенное пользователем целое число с консоли;
- nextDouble () - отвечает за то, чтобы считать введённое пользователем дробное число с консоли. */

import java.util.Scanner;

public class Scanner1 {
    public static void main(String args[]){
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);
        /*Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = k.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = k.nextInt();//считывает второе число и присваивает значение в number2
        System.out.print(number1 + number2);//выводит сумму number1 + number2*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        System.out.println(phrase1);*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите любые 2 слова или фразу: ");
        String phrase1 = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(phrase1 + " " + phrase2);*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.next();
        System.out.println(phrase1);*/
        /*System.out.print("Введите любое дробное число: ");
        Scanner scan = new Scanner(System.in);
        double number = scan.nextDouble();
        System.out.println ("Вы ввели число " + number);*/
    }
}
