package methods.MyOwnMethods;

public class SimpleMethods {
    public static void main(String[] args) {

        sayHello1();

        sayHello2("Андрей");

        calcSum1();

        int a = 35;
        int b = 77;
        calcSum2(a, b);

        double resultDivision = calcDivision();
        System.out.println("Результат деления: " + resultDivision);

//        calcDivision();
//        System.out.println("Результат деления: " + calcDivision());

        int resultMult = calcMult(23, 56);
        System.out.println("Результат умножения: " + resultMult);

        int[] mas = new int[]{1, 2, 3};
        multiElement(mas, 10);
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + ", ");
        }

        int c = getStrLength("ABCDEF");
        System.out.println("\n" + c);

        func1(5, 6);

        int temp = func2(3, 4);
        System.out.println(temp);
    }

    /** 1 */
    //Метод без типа возвращаемого значения без параметров
    public static void sayHello1() {
        String name = "Василий";
        System.out.println("Привет, меня зовут " + name + "!");
    }

    //Метод без типа возвращаемого значения без параметров
    public static void calcSum1() {
        int a = 25;
        int b = 89;
        int sum = a + b;
        System.out.println("Результат сложения: " + sum);
    }

    /** 2 */
    //Метод без типа возвращаемого значения с параметрами
    public static void sayHello2(String name) {
        System.out.println("Привет, меня зовут " + name + "!");
    }

    //Метод без типа возвращаемого значения с параметрами
    public static void calcSum2(int a, int b) {
        int sum = a + b;
        System.out.println("Результат сложения: " + sum);
    }

    //Метод без типа возвращаемого значения с параметрами
    public static void multiElement(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= value;
        }
    }

    //Метод без типа возвращаемого значения с параметрами
    public static void func1(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        System.out.println(result);
    }

    /** 3 */
    //Метод с типом возвращаемого значения int без параметров
    public static double calcDivision() {
        double a = 100;
        double b = 20;
        //double division = a / b;
        return a/b;
    }

    /** 4*/
    //Метод с типом возвращаемого значения int с параметрами
    public static int getStrLength(String str) {
        int strLength = str.length();
        return strLength;
    }

    //Метод с типом возвращаемого значения с параметрами
    public static int calcMult(int a, int b) {
        int mult = a * b;
        return mult;
    }

    //Метод с типом возвращаемого значения с параметрами
    public static int func2(int a, int b) {
        int result = 1;
        for (int i = 0; i < b; i++)
            result *= a;
        return result;
    }
}