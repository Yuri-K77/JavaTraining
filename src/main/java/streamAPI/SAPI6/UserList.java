package streamAPI.SAPI6;

public class UserList {

    private int age;
    private String sex;
    private String name;

    public UserList(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
