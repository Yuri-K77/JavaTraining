package VariableArguments;

class VarClass {
    public int addAll(int ... numbers)
    {
        int sum = 0;

        for (int i = 0; i < numbers.length ; i++)
        {
            sum = sum + numbers[i];
            System.out.println("Adding " + numbers[i] + ": get " + sum);
        }
        return sum;
    }
}