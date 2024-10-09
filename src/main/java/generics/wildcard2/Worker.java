package generics.wildcard2;

public class Worker extends Person{

    public int age;
    public String work;

    public Worker(String name, int age, String work) {
        super(name);
        this.age = age;
        this.work = work;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", work='" + work + '\'' +
                '}';
    }
}
