package classes.GetSet;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Lester", 4, 2);
        Cat.count++;

        //Вариант 1
        System.out.println("Имя кота: " + cat.getName());
        System.out.println("Возраст кота: " + cat.getAge() + " лет");
        System.out.println("Вес кота: " + cat.getWeight() + " кг");

        //Вариант 2
        String lesterName = cat.getName();
        int lesterAge = cat.getAge();
        int lesterWeight = cat.getWeight();
        System.out.println("\n" + lesterName);
        System.out.println(lesterAge);
        System.out.println(lesterWeight);

        //Установка новых параметров с помощью сеттеров
        cat.setName("Mandis");
        cat.setAge(6);
        cat.setWeight(3);

        //Вывод новых параметров
        System.out.println("\n" + "Новое имя кота: " + cat.getName());
        System.out.println("Новый возраст кота: " + cat.getAge() + " лет");
        System.out.println("Новый вес кота: " + cat.getWeight() + " кг");

        System.out.println("\n" + "Общее количество котов = " + Cat.count);
    }
}
