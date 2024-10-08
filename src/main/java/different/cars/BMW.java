package different.cars;

public class BMW extends Car {

    private String model;

    public BMW(String color, boolean fwd, int speed, String model) {
        super(color, fwd, speed);
        this.model = model;
    }

    @Override
    public void checkSpeedLimit() {
        if(getSpeed()>120) {
            System.out.println("Attention, speed is too high");
        } else {
            System.out.println("Everything OK");
        }
    }

    public void getModel() {
        System.out.println(this.getClass().getSimpleName() + " model: " + model);
    }
}