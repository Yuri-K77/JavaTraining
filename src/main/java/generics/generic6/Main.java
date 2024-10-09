/* Использование нескольких универсальных параметров */

package generics.generic6;

public class Main {

    public static void main(String[] args) {

        Account<String, Double> account = new Account<>("354", 5000.87);
        String id = account.getId();
        Double sum = account.getSum();
        System.out.printf("Id: %s  Sum: %f \n", id, sum);
    }
}
