package tetris;

import java.util.ArrayList;

public class Tetris {

    public static void main(String[] args) {

        System.out.println("1. First sorting of array");
        Common[] array = {new Line(), new Square(), new Lighting()};

        for (int i = 0; i < array.length; i++) {
            array[i].left();
            array[i].right();
            array[i].rotate();
            array[i].down();
            System.out.println("\t");
        }

        System.out.println("2. Second sorting of ArrayList");
        ArrayList<Common> list = new ArrayList<>();
        list.add(new Line());
        list.add(new Square());
        list.add(new Lighting());

        for (Common i : list) {
            i.left();
            i.right();
            i.down();
            i.rotate();
            System.out.println("\t");
        }
    }
}