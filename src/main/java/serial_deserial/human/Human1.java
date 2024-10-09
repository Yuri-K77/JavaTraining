package serial_deserial.human;

import java.io.Serializable;

public class Human1 implements Serializable {

    public String name;
    public String address;

    public Human1(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
