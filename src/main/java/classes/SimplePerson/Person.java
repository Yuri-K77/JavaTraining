package classes.SimplePerson;

public class Person {

    //Установка полей без параметров для объекта
    private String name;
    private int age;

    //Установка полей с параметрами для объекта
//    private String name = "Незнакомец";
//    private int age = 35;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Метод без типа возвращаемого значения в main (не имеет типа возвращаемого значения, просто производит операцию)
    void sayHello() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello!");
        }
    }

    //Метод без типа возвращаемого значения в main (не имеет типа возвращаемого значения, просто производит операцию)
    void introduceYourself() {
        System.out.println("Меня зовут " + name + ", мне " + age + " лет");
    }

    //Метод без типа возвращаемого значения в main (не имеет типа возвращаемого значения, просто производит операцию)
    void calculateYearsToRetirement1() {
        int years = 65 - age;
        System.out.println("Количество лет до пенсии: " + years);
    }

    //Метод с типом возвращаемого значения int (данный метод возвращает значение в месте, в котором его вызвали - в main)
    int calculateYearsToRetirement2() {
        int years = 65 - age;
        return years;
    }
}