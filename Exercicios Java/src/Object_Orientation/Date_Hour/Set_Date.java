package Object_Orientation.Date_Hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Set_Date {
    static void main() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalDateTime time = LocalDateTime.now();
        System.out.println(time);
        Instant instant = Instant.now();
        System.out.println(instant);
        LocalDate localDate = LocalDate.parse("2026-06-03");
        LocalDateTime localDateTime = LocalDateTime.parse("2026-06-03T08:45:39");
        Instant instant2 = Instant.parse("2026-06-03T08:45:39Z");
        Instant instant3 = Instant.parse("2026-06-03T08:45:39-03:00");
        LocalDate date02= LocalDate.parse("06/03/2026", dtf);
        LocalDateTime date03= LocalDateTime.parse("06/03/2026 09:02", dtf2);
        LocalDate date04= LocalDate.of(2026, 3, 6);
        LocalDateTime date05= LocalDateTime.of(2026, 3, 6, 9, 10);
        System.out.println(localDate);
        System.out.println(localDateTime);
        System.out.println(instant2);
        System.out.println(instant3);
        System.out.println(date02);
        System.out.println(date03);
        System.out.println(date04);
        System.out.println(date05);
    }
}
