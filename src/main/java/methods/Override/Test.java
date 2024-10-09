package methods.Override;

public class Test {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.voice();
        Dog myDog = new Dog();
        myDog.voice();
        Cow myCow = new Cow();
        myCow.voice();
    }
}