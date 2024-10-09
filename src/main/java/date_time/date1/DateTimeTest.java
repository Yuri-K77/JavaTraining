package date_time.date1;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class DateTimeTest {

    public static boolean validateDateTimeFormat(String pattern, String stringWithDateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        try {
            dateTimeFormatter.parse(stringWithDateTime);//преобразует строку в объект даты
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean validateSorting(String[] stringDates) {
        List<LocalDateTime> actualList = new ArrayList<>();
        for (String date : stringDates) {
            actualList.add(LocalDateTime.parse(date, DateTimeFormatter.ofPattern("MM/dd/yyyy, HH:mm")));
        }
        List<LocalDateTime> expectedList = new ArrayList<>(actualList);
//        expectedList.sort(Comparator.naturalOrder());//Comparator.reverseOrder()
        Collections.sort(actualList);
        return actualList.equals(expectedList);
    }

    /**
     * @param actualDateTime it's our text from UI element
     */
    public static boolean validateFutureDate(String actualDateTime) {
        LocalDateTime localDateTime = LocalDateTime
                .now()
                .plusMonths(6);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
        String expectedDateTime = dateTimeFormatter.format(localDateTime);//преобразует объект даты в строку

        return expectedDateTime.equals(actualDateTime);
        /*
        Проверили, что та дата которая отображена на UI соответствует
        требованиям задачи, т.е. текущая дата/время плюс 6 месяцев.
        */
    }

    /**
     * @see ZoneId#SHORT_IDS
     */
    public static void testZonedDateTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy, HH:mm z");

        ZonedDateTime zonedDateTimeWithTimeZone = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("Zoned: " + zonedDateTimeWithTimeZone.format(dateTimeFormatter));//Zoned: 01/09/2022, 19:58 UTC

        ZonedDateTime zonedDateTimeLocal = ZonedDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        System.out.println("Local: " + zonedDateTimeLocal.format(dateTimeFormatter));//Local: 01/09/2022, 22:58 MSK
    }

    public static void testSimpleDateFormat() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
