package different.cars;

public abstract class Car {

    private String color;
    private boolean fwd;
    private int speed;

    public Car(String color, boolean fwd, int speed) {
        this.color = color;
        this.fwd = fwd;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void getColor() {
        System.out.println("car color is " + color);
    }

    public void isCarFwd() {
        if(fwd) {
            System.out.println("car has FWD");
        } else {
            System.out.println("car has not FWD");
        }
    }

    public abstract void checkSpeedLimit();
}