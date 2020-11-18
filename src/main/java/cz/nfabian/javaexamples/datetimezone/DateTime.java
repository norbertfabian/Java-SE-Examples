package cz.nfabian.javaexamples.datetimezone;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {

    public static void main(String[] args) {

        // Init
        LocalDate nowDate = LocalDate.now();
        LocalDate specificDate = LocalDate.of(2020, 8, 15);

        LocalTime nowTime = LocalTime.now();
        LocalTime specificTime = LocalTime.of(12, 30);

        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime specificDateTime = LocalDateTime.of(specificDate, specificTime);

        // Operations
        LocalDate threeWeeksEarlier = specificDate.minusWeeks(3);
        specificDate.isBefore(nowDate);

        System.out.println(specificDate.getDayOfWeek()); // SATURDAY
        System.out.println(specificDate.getDayOfMonth()); // 15
        System.out.println(specificDate.getMonth()); // AUGUST
    }
}
