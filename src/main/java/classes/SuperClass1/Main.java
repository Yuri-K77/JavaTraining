package classes.SuperClass1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat ("мозг", "сердце", "хвост");
        System.out.println("Наш кот имеет " + cat.brain + ", " + cat.heart + " и " + cat.tail);

        System.out.println(cat.brain);
        System.out.println(cat.heart);
        System.out.println(cat.tail);

        Dog dog = new Dog ("мозг", "сердце", "уши");
        System.out.println("Наша собака имеет " + dog.brain + ", " + dog.heart + " и " + dog.hears);

        System.out.println(dog.brain);
        System.out.println(dog.heart);
        System.out.println(dog.hears);
    }
}
