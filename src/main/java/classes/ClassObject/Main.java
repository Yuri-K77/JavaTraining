/* Хотя мы можем создать обычный класс, который не является наследником, но фактически все классы наследуются от
класса Object. Все остальные классы, даже те, которые мы добавляем в свой проект, являются неявно производными от
класса Object. Поэтому все типы и классы могут реализовать те методы, которые определены в классе Object.
 */

package classes.ClassObject;

public class Main {
    public static void main(String[] args) {
        User user = new User("Tom", 23);
        //Метод toString() - служит для получения представления данного объекта в виде строки (как правило, будет выводиться
        // полное имя с указанием пакета, класса и хеш-кода Classes.ClassObject.User@eed1f14, переопределён в User)
        System.out.println(user.toString());

        User user1 = new User("Bob", 34);
        System.out.println(user1.toString());

        User user2 = new User("John", 41);
        System.out.println(user2.toString());

        //Метод hashCode() - позволяет получить хэш-код объекта 2003749087
        // (по данному числу, например, можно сравнивать объекты, переопределён в User)
        System.out.println("Получение хеш-кода объекта через метод hashCode(): " + user.hashCode());
        System.out.println("Получение хеш-кода объекта через метод hashCode(): " + user1.hashCode());
        System.out.println("Получение хеш-кода объекта через метод hashCode(): " + user2.hashCode());

        //Метод getClass() - позволяет получить информацию об объекте (к какому классу принадлежит)
        System.out.println("Получение информации об объекте через метод getClass(): " + user.getClass());
        System.out.println("Получение информации об объекте через метод getClass(): " + user1.getClass());
        System.out.println("Получение информации об объекте через метод getClass(): " + user2.getClass());

        //Метод equals() - сравнивает два объекта на равенство
        System.out.println("Сравнение объектов через метод equals(): " + user.equals(user1));//по ссылке
        System.out.println("Сравнение объектов через метод equals(): " + user.equals(user2));//по ссылке
        System.out.println("Сравнение объектов по имени через метод equals(): " + user.getName().equals("Tom"));//по имени
        System.out.println("Сравнение объектов по имени через метод equals(): " + user.getName().equals("Bob"));//по имени
    }
}
