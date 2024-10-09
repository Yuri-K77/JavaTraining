package serial_deserial.jackson.jackson2;

public class UserClass {

    public String userName;
    public int userAge;
    public String userAddress;

    public UserClass() {

    }

    public UserClass(String userName, int userAge, String userAddress) {
        this.userName = userName;
        this.userAge = userAge;
        this.userAddress = userAddress;
    }

    public void print() {
        System.out.println("Hello, my name is " + userName);
    }
}