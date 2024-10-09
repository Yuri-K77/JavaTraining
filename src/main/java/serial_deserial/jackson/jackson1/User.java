package serial_deserial.jackson.jackson1;

public class User {
    //1.Простой объект
    private int id;
    private String firstName;
    private  String lastName;

    public User (){

    }

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //2.Массив данных
//    private int array[];
//
//    public int[] getArray() {
//        return array;
//    }
//
//    public void setArray(int[] array) {
//        this.array = array;
//    }

    //3.Вложенный объект
//    private InnerObject innerObject;
//
//    public InnerObject getInnerObject() {
//        return innerObject;
//    }
//
//    public void setInnerObject(InnerObject innerObject) {
//        this.innerObject = innerObject;
//    }
}
