package Object_Orientation.Date_Hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Set_Date2 {
    static void main() {

        LocalDate d01 = LocalDate.parse("2026-03-06");
        LocalDateTime d02 = LocalDateTime.parse("2026-03-06T09:13:45");
        Instant d03 = Instant.parse("2026-03-06T09:14:50Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d01: " + d01.format(fmt1));
        System.out.println("d01: " + fmt2.format(d03));


    }
}
