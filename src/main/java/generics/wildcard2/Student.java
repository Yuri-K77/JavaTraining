package generics.wildcard2;

public class Student extends Person{

    public int age;
    public String faculty;

    public Student(String name, int age, String faculty) {
        super(name);
        this.age = age;
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", faculty='" + faculty + '\'' +
                '}';
    }
}
