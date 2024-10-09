package classes.ClassObject;

public class SpringPoolTest {
    public static void main(String[] args) {
        String test1 = "testing";
        String test2 = "testing";
        String test3 = new String("testing");

        System.out.println(test1==test3);//сравнение объектов по ссылкам
        System.out.println(test1.equals(test3));//сравнение объектов по значению
        System.out.println("*******************");
        System.out.println(test1==test2);//сравнение объектов по ссылкам
        System.out.println(test1.equals(test2));//сравнение объектов по значению

    }
}
