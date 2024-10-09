package serial_deserial.basic;

import java.io.Serializable;


public class Person implements Serializable {
    private int id;
    private String name;
    private double age;
    //private transient double age; //исключение поля объекта из сериализации при помощи модификатора transient


    public Person(int id, String name, double age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public String toString() {
        return id + ": " + name + ", " + age;
    }
}
