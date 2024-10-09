package VariableArguments;

public class Main {
    public static void main(String[] args) {
        VarClass obj = new VarClass();

        System.out.println(obj.addAll(1,2));
        System.out.println(obj.addAll(1,2,3));
    }
}