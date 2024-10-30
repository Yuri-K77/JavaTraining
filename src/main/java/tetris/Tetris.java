package tetris;

public class Tetris {

    public static void main(String[] args) {

        String[] array = {"Line", "Square", "Lightning"};

        int a = array.length;

        for (int i = 0; i < a - 2; i++) {
            System.out.println("LEFT ");
            System.out.println("RIGHT");
            System.out.println("I-ROTATE");
            System.out.println("DOWN" + "\n");
            for (int j = 0; j < a - 2; j++) {
                System.out.println("LEFT ");
                System.out.println("RIGHT");
                System.out.println("O-ROTATE");
                System.out.println("DOWN" + "\n");
                for (int k = 0; k < a - 2; k++) {
                    System.out.println("LEFT ");
                    System.out.println("RIGHT");
                    System.out.println("Z-ROTATE-Z");
                    System.out.println("Z-DOWN");
                }
            }
        }
    }
}