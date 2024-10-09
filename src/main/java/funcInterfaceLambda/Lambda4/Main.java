package funcInterfaceLambda.Lambda4;

public class Main {
    //Использования переменных уровня класса
    static int x = 20;
    static int y = 10;

    public static void main(String[] args) {
       Variables variables1 = () -> {
           x = 35; //для переменных, объявленных на уровне класса, значение можно изменять в блоке кода лямбда-выражения
           return x * y;
       };
        System.out.println("Результат умножения: " + variables1.calculate());
        System.out.println("Изменённое значение: x = " + x);

        //Блочные выражения - обрамляются фигурными скобками. В блочных лямбда-выражениях можно использовать внутренние
        // вложенные блоки, циклы, конструкции if, switch, создавать переменные и т.д. Если блочное лямбда-выражение должно
        // возвращать значение, то явным образом применяется оператор return
        Variables variables2 = () -> {
            if (y==0)
            return 0;
            else
            return x/y;
        };
        System.out.println(variables2.calculate());
    }
}
