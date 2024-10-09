package classes.GetSet;

class Cat {
    //Поля (или переменные экземпляров) - эти переменные будут у каждого экземпляра (объекта) класса Cat
    private String name;
    private int age;
    private int weight;

    //Переменная класса (или статическая) - обозначена ключевым словом static, это значит, что она принадлежит классу, а не конкретному объекту класса
    static int count = 0;

    //Конструктор — шаблон для создания объектов (экземпляров) класса
    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Метод геттер - не имеет параметров (т.е. в скобках ничего не пишется) и возвращает значение одной переменной (одного поля)
    public String getName() {
        return name;
    }

    //Метод сеттер - всегда имеет модификатор void и только один параметр в скобках, для изменения значения одного поля
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    //Метод сеттер позволяет установить внутри себя проверку каких либо условий
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Ошибка! Вес не может быть отрицательным числом!");
        }
    }
}