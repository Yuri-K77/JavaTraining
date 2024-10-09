package funcInterfaceLambda.Lambda2;

public class Main {
    public static void main(String[] args) {
        //Реализация по старому через анонимный класс
            Operation operation = new Operation() {
            @Override
            public int getResult(int a, int b) {
                return a + b;
            }
        };
        System.out.println(operation.getResult(33, 28));

        //Реализация по новому через лямбда выражения (нетерминальное лямбда выражение - возвращает значение)
        Operation lambda = (a, b) -> a + b;
        Operation lambda1 = (a, b) -> a - b;
        Operation lambda2 = (a, b) -> a * b;
        System.out.println("\n" + lambda.getResult(33, 56));
        System.out.println(lambda1.getResult(126, 98));
        System.out.println(lambda2.getResult(64, 32));

        //Реализация по новому через лямбда выражения (терминальное лямбда выражение - не возвращает никакого значения)
        Printer printer = string -> System.out.println(string);
        printer.println("\n" + "Superrrrrr!!!");

        //Блочные лямбда выражения
        Factorial factorial = value -> {
            int result = 1;
            for (int i = 1; i <= result; ++i) {
            result *= i;}
            return result;
        };
        System.out.println("\n" + factorial.getResult(5));
    }
}
