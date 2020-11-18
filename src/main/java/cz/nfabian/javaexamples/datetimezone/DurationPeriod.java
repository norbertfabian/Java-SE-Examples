package cz.nfabian.javaexamples.datetimezone;

import java.time.Duration;
import java.time.LocalTime;

public class DurationPeriod {

    public static void main(String[] args) {
        LocalTime beforeNow = LocalTime.now().minusHours(6);
        LocalTime now = LocalTime.now();

        Duration timeGap = Duration.between(beforeNow, now);

        System.out.println(timeGap.toMinutes()); // 360
        System.out.println(timeGap.toHours()); // 6
    }
}
