package generics.generic1;

@SuppressWarnings("all")
public class TestGenericInterface<T> {

    public void testInterface(Interface inter, T var){
        inter.get(var);
    }

    public static void main(String[] args) {

        TestGenericInterface testGenericInterface = new TestGenericInterface<>();

        testGenericInterface.testInterface((a) -> System.out.println(a), 100);

        testGenericInterface.testInterface((a) -> System.out.println(a), "Hello world");

        testGenericInterface.testInterface((a) -> System.out.println(a), new Object());

    }
}