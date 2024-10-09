package funcInterfaceLambda.Lambda5;

public class Main {
    public static void main(String[] args) {
        //Использования переменных уровня метода
        int x = 45;
        int y = 60;

        Variables variables = () -> {
            //x = 70; ////для переменных, объявленных на уровне метода, значение нельзя изменять в блоке кода лямбда-выражения
            return x * y;
        };
        //x = 70; //после блока кода значение также нельзя изменять
        System.out.println("Результат умножения: " + variables.calculate());
    }
}
