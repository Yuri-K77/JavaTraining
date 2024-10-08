package operators.TransitionOperators;/* Continue - позволяет опустить участок кода и вернуться в начало цикла. */

public class Continue {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++){
            System.out.println(i + ": я выполняюсь перед continue!");
            if (i > 3)
                continue;
            System.out.println("     " + i + ": я выполняюсь всего три раза;");
        }
    }
}
