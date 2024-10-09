package exceptions;

public class ExceptionsTest {

    public static void printParameter() {
        switch (System.getenv("parameter")){
            case "1":
                System.out.println("1");
                break;
            case "2":
                System.out.println("2");
                break;
            default: throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {

        printParameter();
    }
}