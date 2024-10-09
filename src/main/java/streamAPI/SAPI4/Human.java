package streamAPI.SAPI4;

import java.util.List;
import java.util.stream.Collectors;

public class Human {

    private final int age;

    public Human(int age) {
        this.age = age;
    }

//    public Human() {
//
//    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{" + "age=" + age + '}';
    }

    public static List<Human> makeHumans(List<Integer> ages) {
        return ages
                .stream()
                .map(age -> new Human(age))
                .collect(Collectors.toList());
        //return ages.stream().map(Human::new).collect(Collectors.toList()); // тоже самое, немного другая запись
    }

    public static List<Integer> makeAges(List<Human> humans) {
        return humans
                .stream()
                .map(human -> human.getAge())
                .collect(Collectors.toList());
        //return humans.stream().map(Human::getAge).collect(Collectors.toList()); // тоже самое, немного другая запись
    }
}