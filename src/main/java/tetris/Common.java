package tetris;

public abstract class Common {

    public void left() {
        System.out.println("LEFT");
    }

    public void right() {
        System.out.println("RIGHT");
    }

    public void down() {
    }

    public abstract void rotate();
}