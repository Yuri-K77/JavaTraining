package generics.generic3;

interface Accountable<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
