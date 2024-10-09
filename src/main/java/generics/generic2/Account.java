package generics.generic2;

class Account<T>{

    private T id;
    private T sum;

    Account(T id, T sum){
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public T getSum() {
        return sum;
    }

    public void setSum(T sum) {
        this.sum = sum;
    }
}