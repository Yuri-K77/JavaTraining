package generics.wildcard3;

public class Animal {

    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    @Override
    public String toString() {
        return String.valueOf("Animal id - " + id);
    }
}
