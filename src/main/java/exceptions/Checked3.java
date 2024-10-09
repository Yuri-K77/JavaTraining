package exceptions;

import java.util.Scanner;

public class Checked3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            if (n == 0) {
                throw new Exception("Число n равно нулю");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Программа завершена");
        }
    }
}
