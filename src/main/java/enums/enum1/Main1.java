package enums.enum1;

public class Main1 {
    public static void main(String[] args) {
        Seasons arg = Seasons.FALL;

        switch (arg) {
            case WINTER -> System.out.println("It's winter! Christmas time!");
            case SUMMER -> System.out.println("It's summer! Let's go to the beach!");
            case SPRING -> System.out.println("It's spring! Easter is coming!");
            case FALL -> System.out.println("It's fall! Helloween is coming!");
        }
    }
}
