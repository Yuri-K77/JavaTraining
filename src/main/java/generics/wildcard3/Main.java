package generics.wildcard3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal(1));
        animalList.add(new Animal(2));

        test(animalList);

        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog(3,4));
        dogList.add(new Dog(5,6));

        test(dogList);
    }

    /*
    Object
    Animal
    Dog
     */

    static void test(List<? extends Animal> list) {
        for (Animal animal: list) {
            System.out.println(animal);
            animal.eat();
        }
    }
}
