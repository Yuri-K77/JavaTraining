package date_time.date2;

import java.text.ParseException;
import java.time.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class DateTest {

    public static boolean isDateValid(String date, String pattern) {
        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern, Locale.US));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isTimeValid(String time, String pattern) {
        try {
            LocalTime.parse(time, DateTimeFormatter.ofPattern(pattern, Locale.US));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean simpleDate(String simpleDate, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, Locale.US);
        try {
            simpleDateFormat.parse(simpleDate);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isDateValid("Monday 7 Feb 2022", "EEEE d MMM yyyy"));
        System.out.println(isTimeValid("22/24/30", "HH/mm/ss"));
        System.out.println(simpleDate("Mon 7 Feb 22:44", "E d MMM HH:mm"));
    }
}
