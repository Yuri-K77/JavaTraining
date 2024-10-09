package classes.ClassStatic;

public class StaticMethods {

    //Метод без типа возвращаемого значения без параметров
    public static void sayYourMame() {
        String name = "Alex";
        System.out.println("Hi, my name is " + name + "!");
    }

    //Метод без типа возвращаемого значения без параметров
    public static void calcSum() {
        double a = 425.2;
        double b = 89.6;
        double sum = a + b;
        System.out.println("Результат сложения: " + sum);
    }

    //Метод без типа возвращаемого значения с параметрами
    public static void inputYourName(String name) {
        System.out.println("Hello, my name is " + name + "!");
    }

    //Метод без типа возвращаемого значения с параметрами
    public static void divisionByMod(float a, float b) {
        float result = a % b;
        System.out.println("Результат деления по модулю: " + result);
    }

    //Метод с типом возвращаемого значения без параметров
    public static short calcDivision() {
        long a = 100;
        long b = 20;
        long division = a / b;
        return (short) division;
    }

    //Метод с типом возвращаемого значения int с параметрами
    public static byte calcMult(int a, int b) {
        int mult = a * b;
        return (byte) mult;
    }
}
