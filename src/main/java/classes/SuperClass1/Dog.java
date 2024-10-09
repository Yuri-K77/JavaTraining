package classes.SuperClass1;

class Dog extends Animal {
    String hears;

    public Dog (String brain, String heart, String hears) {
        super(brain, heart);
        this.hears = hears;
    }
}
