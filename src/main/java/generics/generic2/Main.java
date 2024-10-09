/* Реализация обобщённого класса */

package generics.generic2;

public class Main {
    public static void main(String[] args) {

        Account<String> acc1 = new Account<>("123", "4000");
        String acc1Id = acc1.getId();
        String acc1sum = acc1.getSum();
        System.out.println("Person ID: " + acc1Id + ", " + "person amount of money: " + acc1sum);

        Account<Integer> acc2 = new Account<>(456, 5000);
        Integer acc2Id = acc2.getId();
        Integer acc2sum = acc2.getSum();
        System.out.println("\n" + "Person ID: " + acc2Id + ", " + "person amount of money: " + acc2sum);

        acc2.setSum(37897);
        System.out.println("\n" + "New amount of money: " + acc2.getSum());
    }
}