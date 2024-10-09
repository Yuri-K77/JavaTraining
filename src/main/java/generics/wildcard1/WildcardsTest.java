package generics.wildcard1;

import java.util.ArrayList;
import java.util.List;

public class WildcardsTest {

    public static void iterateUserWildcard1(List<? extends UserWildcard> list) {
        list.forEach(UserWildcard::test);
    }

    public static void iterateUserWildcard2(List<? super Woman> list) {
        for(Object userWildcard: list) {
            System.out.println(userWildcard);
        }
    }

    public static void main(String[] args) {

        List<Man> manList = new ArrayList<>();
        manList.add(new Man("Mark",23, "Toronto"));
        manList.add(new Man("Bill", 34, "New York"));

        List<Woman> womanList = new ArrayList<>();
        womanList.add(new Woman("Kate", 20, "Moscow"));
        womanList.add(new Woman("Mary", 28, "London"));

        iterateUserWildcard1(manList);
        iterateUserWildcard1(womanList);

        iterateUserWildcard2(womanList);
    }
}
