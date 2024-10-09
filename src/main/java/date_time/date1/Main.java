package date_time.date1;

import java.text.ParseException;
import java.util.*;

import static date_time.date1.DateTimeTest.*;

public class Main {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        System.out.println("Current date & time as human-readable date: " + date);
        System.out.println("Current date & time as timestamp(epoch): " + date.getTime());//since 1970

        // #1 Извлекли строку с датой и временем из ui элемента с целью проверить на корректность формата данных
        System.out.println("Valid case: " + validateDateTimeFormat("E MMM dd HH:mm:ss z yyyy", "Mon Dec 27 21:28:32 MSK 2021"));
        System.out.println("Invalid case: " + validateDateTimeFormat("E MMMM dd HH:mm:ss z yyyy", "Mon Dec 27 21:28:32 MSK 2021"));
        System.out.println("Invalid case: " + validateDateTimeFormat("E MMM dd HH/mm/ss z yyyy", "Mon Dec 27 21:28:32 MSK 2021"));
        System.out.println("Invalid case: " + validateDateTimeFormat("E MMM dd HH:M:ss z yyyy", "Mon Dec 27 21:28:32 MSK 2021"));
        System.out.println("Invalid case: " + validateDateTimeFormat("MMMM dd HH:M:ss z yyyy", "Mon Dec 27 21:28:32 MSK 2021"));
        System.out.println("Invalid case: " + validateDateTimeFormat("E MMMM dd HH:M:ss yyyy", "Mon Dec 27 21:28:32 MSK 2021"));

        System.out.println("\n");

        // #2 Извлекли строки ui элементов, и надо проверить, что элементы с датами расположены в правильном порядке на экране
        System.out.println("Valid sorting case: " + validateSorting(new String[]{"10/15/2021, 11:14", "10/15/2021, 11:15", "10/15/2021, 12:34"}));
        System.out.println("Invalid sorting case: " + validateSorting(new String[]{"10/15/2021, 11:15", "10/15/2021, 11:14", "10/15/2021, 12:34"}));

        System.out.println("\n");

        //#3 Проверить, что дата в ui элементе соответствует ожидаемой дате(например, текущая плюс 6 месяцев)
        System.out.println("Is actual date & time from UI and expected are equals: " + validateFutureDate("02 August 2022"));
    }
}

    /*
     dd-M-yyyy hh:mm:ss	        02-1-2018 06:07:59
     dd MMMM yyyy	            02 January 2018
     dd MMMM yyyy zzzz	        02 January 2018 India Standard Time
     E, dd MMM yyyy HH:mm:ss z	Tue, 02 Jan 2018 18:07:59 IST
     E MMM dd HH:mm:ss z yyyy   Mon Dec 27 21:28:32 MSK 2021
    */