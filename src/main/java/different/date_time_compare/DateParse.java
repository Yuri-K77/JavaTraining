package different.date_time_compare;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public class DateParse {

    public static LocalTime parseTime(String string, String pattern) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern, Locale.US);
        return LocalTime.parse(string, dateTimeFormatter);
    }

    public static boolean validateSorting(String[] times) {
        List<LocalDateTime> actualList = new ArrayList<>();
        for (String date : times) {
            actualList.add(LocalDateTime.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy, HH:mm")));
        }
        List<LocalDateTime> expectedList = new ArrayList<>(actualList);
//        expectedList.sort(Comparator.naturalOrder());//Comparator.reverseOrder()
        Collections.sort(actualList);
        return actualList.equals(expectedList);
    }
}
