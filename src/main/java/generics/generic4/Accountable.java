package generics.generic4;

interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}