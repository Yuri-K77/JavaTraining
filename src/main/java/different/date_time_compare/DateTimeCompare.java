/** order #34534534 08:10:55 pm
* 1) получить коллекцию объектов LocalTime
 * 2) придумать как проверить сортировку
* */

package different.date_time_compare;


import org.assertj.core.api.Assertions;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static different.date_time_compare.DateParse.parseTime;


public class DateTimeCompare {

    public static void main(String[] args) {

//        Date date = new Date();
//        System.out.println(date);
//        System.out.println(date.getTime());

        String item1 = " order #34534534 08:10:55 PM ";
        String item2 = " order #34534534 10:13:55 PM ";
        String item3 = " order #34534534 09:19:55 AM ";

        List<String> list = Arrays.asList(item1, item2, item3);
//        list.add(item1);
//        list.add(item2);
//        list.add(item3);

        List<String> times = list.stream().map(item -> item.trim().split(" ")[2] + " " + item.trim().split(" ")[3]).collect(Collectors.toList());

        List<LocalTime> actualTimes = times.stream().map(time-> parseTime(time, "hh:mm:ss a")).collect(Collectors.toList());

        List<LocalTime> expectedTimes = new ArrayList<>(actualTimes);

        Collections.sort(expectedTimes);//сортировка по возрастанию значений
//        Collections.reverse(expectedTimes);//сортировка по убыванию значений

        Assertions.assertThat(actualTimes).isEqualTo(expectedTimes);
    }
}