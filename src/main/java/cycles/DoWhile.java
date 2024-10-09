package cycles;/* Цикл do...while еще называют  цикл "делать до тех пор пока", сначала выполняет тело цикла, а потом проверяет условие,
поэтому тело цикла выполнится, как минимум, 1 раз. */

public class DoWhile {
    public static void main(String args[]) {
        int i = 1;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }
}
