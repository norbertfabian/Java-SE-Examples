package cz.nfabian.javaexamples.datetimezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZone {

    public static void main(String[] args) {
        ZoneId londonTimeZone = ZoneId.of("Europe/London");
        ZoneId katmanduTimeZone = ZoneId.of("Asia/Katmandu");

        LocalDateTime now = LocalDateTime.now();

        ZonedDateTime londonDateTime = ZonedDateTime.of(now, londonTimeZone);
        ZonedDateTime katmanduDateTime = londonDateTime.withZoneSameInstant(katmanduTimeZone);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EE', 'd' of 'MMM yyyy' at 'HH:mm z");

        System.out.println("London time: " + dateTimeFormatter.format(londonDateTime)); // Mon, 12 of Oct 2020 at 09:11 BST
        System.out.println("Katmandu time: " + dateTimeFormatter.format(katmanduDateTime)); // Mon, 12 of Oct 2020 at 13:56 NPT
    }
}
