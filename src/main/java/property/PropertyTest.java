package property;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static property.PropertyLoader.*;


public class PropertyTest {

    public static void main(String[] args) {

//        System.out.println(getProperty("User.name"));
//
//        IntStream intStream = IntStream.rangeClosed(1, 10);
//        List<Thread> threads = intStream.mapToObj(i->new Thread(()-> System.out.println(getProperty("User.name")))).collect(Collectors.toList());
//        threads.forEach(Thread::start);

        setProperty("City", "Minsk");
        System.out.println(getProperty("City"));

        storeProperty("Planet", "Saturn");
    }
}
