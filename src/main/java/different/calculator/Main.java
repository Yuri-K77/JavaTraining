package different.calculator;

import static different.calculator.Calculator.subtraction;
import static different.calculator.Calculator.summation;

public class Main {

    public static void main(String[] args) {

        System.out.println("Сумма двух чисел: " + summation( 234,375));
        System.out.println("Разность двух чисел: " + subtraction(712, 245));
    }
}