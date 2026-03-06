package Object_Orientation.Date_Hour;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Set_Date3 {
    static void main() {
        LocalDate d01 = LocalDate.parse("2026-03-06");
        LocalDateTime d02 = LocalDateTime.parse("2026-03-06T09:13:45");
        Instant d03 = Instant.parse("2026-03-06T09:14:50Z");

        LocalDate PastWeekLocalDate = d01.minusDays(7);
        System.out.println(PastWeekLocalDate);
        LocalDate NextWeeekLocalDate = d01.plusDays(7);
        System.out.println(NextWeeekLocalDate);
        LocalDateTime h01 = d02.plusYears(1);
        Instant h02 = d03.plus(7, ChronoUnit.DAYS);
        System.out.println(h01);
        System.out.println(h02);

    }
}
