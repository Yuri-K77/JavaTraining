package initialization_blocks;

class Dog {
    private String name;
    private String breed;
    private int age;

    //Нестатический блок инициализации - используется для инициализации нестатических переменных
    {
        System.out.println("Это нестатический блок инициализации!");
    }

    //Статический блок инициализации - используется для инициализации статических переменных
    /*static
    {
        ///
    }*/

    public Dog(String x, String y, int z){
        name = x;
        breed = y;
        age = z;
    }
}
