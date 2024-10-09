/* Реализация обобщённого интерфейса */

package generics.generic3;

public class Main {

    public static void main(String[] args) {

        Accountable<String> acc1 = new Account("1235", 5000);
        System.out.println(acc1.getId() + ", " + acc1.getSum());

        Account acc2 = new Account("7783", 4300);
        System.out.println("\n" + acc2.getId() + ", " + acc2.getSum());

        acc2.setSum(10790);
        System.out.println("\n" + acc2.getSum());
    }
}