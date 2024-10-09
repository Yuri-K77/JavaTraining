package funcInterfaceLambda.Lambda6;

public class Main {
    public static void main(String[] args) {

        myMethod(() -> System.out.println("Не попал"));

    }

    /**
     *
     * @param someInterface
     */
    public static void myMethod(SomeInterface someInterface) {
        while (Math.random() * 10 < 8) {
            someInterface.doSmth();
        }
        System.out.println("Наконец то попал");
    }
}