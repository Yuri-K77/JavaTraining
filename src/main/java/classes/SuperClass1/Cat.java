package classes.SuperClass1;

class Cat extends Animal {
    String tail;

    public Cat (String brain, String heart, String tail) {
        super(brain, heart);
        this.tail = tail;
    }
}
