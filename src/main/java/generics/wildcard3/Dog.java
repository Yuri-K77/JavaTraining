package generics.wildcard3;

public class Dog extends Animal{

    private int idDog;

    public Dog(int id, int idDog) {
        super(id);
        this.idDog = idDog;
    }

    @Override
    public void eat() {
        //super.eat();
        System.out.println("Dog is eating");
    }

    @Override
    public String toString() {
        return String.valueOf("Dog id - " + idDog);
    }
}
