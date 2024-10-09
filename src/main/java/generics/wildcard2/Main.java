package generics.wildcard2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Bob"));
        personList.add(new Student("Alice", 24, "Psychology"));
        personList.add(new Worker("Jack", 33, "Driver"));

        doSomething(personList);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Pete", 33, "Machine learning"));

        doSomething(studentList);

        List<Worker> workerList = new ArrayList<>();
        workerList.add(new Worker("Nick", 38, "Teacher"));

        doSomething1(workerList);
    }

    static void doSomething(List<? extends Person> personList) {
        System.out.println(personList);
    }

    static void doSomething1(List<? super Worker> workerlist) {
        System.out.println(workerlist);
    }
}
