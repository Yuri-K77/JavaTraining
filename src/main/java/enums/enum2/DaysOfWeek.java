package enums.enum2;

import lombok.AllArgsConstructor;
import lombok.Getter;

//@AllArgsConstructor
//@Getter
public enum DaysOfWeek {

    MONDAY("Понедельник", "1st"),
    TUESDAY("Вторник", "2nd"),
    WEDNESDAY("Среда", "3rd"),
    THURSDAY("Четверг", "4th"),
    FRIDAY("Пятница", "5th"),
    SATURDAY("Суббота", "6th"),
    SUNDAY("Восресенье", "7th");

    private String fullName;
    private String shortName;

    DaysOfWeek(String fullName, String shortName) {
        this.fullName = fullName;
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getShortName() {
        return shortName;
    }
}
