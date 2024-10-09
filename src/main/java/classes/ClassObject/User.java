package classes.ClassObject;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //Полученное значение (в данном случае Classes.ClassObject.User@eed1f14) вряд ли может служить хорошим строковым описанием объекта.
    // Поэтому метод toString() нередко переопределяют
    @Override
    public String toString(){
        return "Переопределённое значение метода toString(): " + "Person " + name + ", " + age + " years";
    }

    //Автогенерация метода toSstring()
    //1.Начинать набирать toString(), дальше компилятор подскажет
    //2.Через Generate
    /*@Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/

    //Задание собственного алгоритма определения хэш-кода объекта
    @Override
    public int hashCode(){
        return 10 * name.hashCode() + 20456;
    }
}
