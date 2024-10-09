package arrays.ArraysObjects;

public class ArrayObjects {
    static Cat[] cats = new Cat [3];

    public static void main (String[] args){
        cats[0] = new Cat("Kitty");
        cats[1] = new Cat("Molly");
        cats[2] = new Cat("Lily");

        for (int i = 0; i<3; i++){
            System.out.println(cats[i].name);
        }
    }
}


