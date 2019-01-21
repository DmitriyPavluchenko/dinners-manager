package util;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public static String dateToString(LocalDate date) {
        return date != null ? date.format(dateTimeFormatter) : "";
    }

    public static LocalDate parseLocalDate(String date) {
        return date != null && !date.isEmpty() ? LocalDate.parse(date, dateTimeFormatter) : null;
    }

    public static String getDayOfWeek(LocalDate date) {
        if (date.isEqual(LocalDate.now())) {
            return "Сегодня";
        } else {
            DayOfWeek dayOfWeek = date.getDayOfWeek();
            switch (dayOfWeek) {
                case MONDAY:
                    return "Понедельник";
                case TUESDAY:
                    return "Вторник";
                case WEDNESDAY:
                    return "Среда";
                case THURSDAY:
                    return "Четверг";
                case FRIDAY:
                    return "Пятница";
                case SATURDAY:
                    return "Суббота";
                case SUNDAY:
                    return "Воскресенье";
                default:
                    return "";
            }
        }
    }
}