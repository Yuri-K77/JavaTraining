package enums.enum1;

public class Main {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.FALL);

        for (Seasons s : Seasons.values()) { //перебор элементов enum с помощью цикла for each
            System.out.println(s);
        }
    }
}
