package streamAPI.SAPI1;

import java.util.ArrayList;
import java.util.List;


public class StreamAPI1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("cvfdvdfbfdvb");
        list.add("1111");
        list.add("2222");
        list.add("cvfaaafbfdvb");
        list.add("cvfdvdfhhhvb");
        list.add("cvflamfhhhvb");

        list
                .stream()
                .limit(5)
                .filter(val -> !val.equals("1111"))
                .map(val -> val + " A")
                .forEach(val -> System.out.println(val));
    }
}