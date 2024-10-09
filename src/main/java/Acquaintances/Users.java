package Acquaintances;

public class Users {
    String name;
    short age;
    int height;

    public Users(String name, short age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public Users(short age, String name, int height){
        this.age = age;
        this.name = name;
        this.height = height;
    }

    public Users(String name, int height, short age){
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public Users(int height, short age, String name){
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public Users(int height, String name, short age){
        this.height = height;
        this.name = name;
        this.age = age;
    }

    public Users(short age, int height, String name){
        this.age = age;
        this.height = height;
        this.name = name;
    }
}
