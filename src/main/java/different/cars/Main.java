package different.cars;

public class Main {

    public static void main(String[] args) {

        BMW bmw = new BMW("red",false, 90, "X7");
        bmw.getModel();
        bmw.getColor();
        bmw.isCarFwd();
        bmw.getSpeed();
        bmw.checkSpeedLimit();
    }
}