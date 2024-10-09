package classes.SimplePerson;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Лёлик", 22);

        //Вариант 1 через переменную
        String personOneName = person1.getName();
        int personOneAge = person1.getAge();
        System.out.println("Меня зовут " + personOneName + ", мне " + personOneAge + " лет");

        //Вариант 2 напрямую через геттеры
        System.out.println("Меня зовут " + person1.getName() + ", мне " + person1.getAge() + " лет");

        //Вариант 3 через собственные методы, объявленные в классе Person
        person1.sayHello();
        person1.introduceYourself();

        //Установка новых значений объекта через сеттеры
        person1.setName("Алекс");
        person1.setAge(30);
        System.out.println("Моё новое имя " + person1.getName() + ", мне " + person1.getAge() + " лет");

        Person person2 = new Person("Болик", 25);
        person2.sayHello();
        person2.introduceYourself();

        //Вызов метода без типа возвращаемого значения
        person2.calculateYearsToRetirement1();

        //Вызов метода с типом возвращаемого значения int
        int years = person2.calculateYearsToRetirement2();
        System.out.println("Количество лет до пенсии: " + years);
    }
}
