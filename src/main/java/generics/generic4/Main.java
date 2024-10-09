/* Реализация обобщённого интерфейса */

package generics.generic4;

public class Main {

    public static void main(String[] args) {

        Account<String> acc1 = new Account<>("3428", 9000);
        System.out.println(acc1.getId() + ", " + acc1.getSum());

        Account<Integer> acc2 = new Account<>(2235, 2510);
        System.out.println("\n" + acc2.getId() + ", " + acc2.getSum());
    }
}