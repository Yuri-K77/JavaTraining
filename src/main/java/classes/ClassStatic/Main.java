package classes.ClassStatic;

public class Main {
    public static void main(String[] args) {

        StaticMethods.sayYourMame();

        StaticMethods.calcSum();

        StaticMethods.inputYourName("Jack");

        StaticMethods.divisionByMod(-77.6f, 33.1f);

        StaticMethods.calcDivision();
        System.out.println("\n" + "Результат деления с явным приведением типов: " + StaticMethods.calcDivision());

        System.out.println("Результат умножения с явным приведением типов: " + StaticMethods.calcMult(45,23));
    }
}