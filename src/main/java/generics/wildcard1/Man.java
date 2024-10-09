package generics.wildcard1;

public class Man extends UserWildcard{

    public String name;
    public int age;
    public String city;

    public Man(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    @Override
    public void test() {
        System.out.println(name + " " + age + " " + city);
    }
}
