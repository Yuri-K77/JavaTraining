package patterns.factory;

/*public class Main {
    public static void main(String[] args) {
        DoughnutFactory factory = new DoughnutFactory();
        for(int i = 0; i < 100; i++) {
            eatRandomDoughnut(factory);
        }
        factory.printCount();
    }

    public static void eatRandomDoughnut(DoughnutFactory factory) {
        Doughnut randomDougnut = getRandomDougnut(factory);
        System.out.printf("What a surprise! ");
        randomDougnut.eat();
    }

    public static Doughnut getRandomDougnut(DoughnutFactory factory){
        Random random = new Random();
        DoughnutTypes type = DoughnutTypes.values()[random.nextInt(DoughnutTypes.values().length)];

        return(factory.getDoughnut(type));
    }

}*/