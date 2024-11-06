package tetris;

public abstract class Common {

    public void left() {
        System.out.println("LEFT");
    }

    public void right() {
        System.out.println("RIGHT");
    }

    public void down() {
        System.out.println("DOWN");
    }

    public abstract void rotate();
}