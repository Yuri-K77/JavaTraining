/* Обобщенные конструкторы */

package generics.generic7;

public class Main {

    public static void main(String[] args) {

        Account acc1 = new Account("4573", 5020);
        System.out.println(acc1.getId() + ", " + acc1.getSum());

        Account acc2 = new Account(5377, 2710);
        System.out.println("\n" + acc2.getId() + ", " + acc2.getSum());
    }
}