package Object_Orientation.Date_Hour;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Set_Date3 {
    static void main() {
        LocalDate d01 = LocalDate.parse("2026-03-06");
        LocalDateTime d02 = LocalDateTime.parse("2026-03-06T09:13:45");
        Instant d03 = Instant.parse("2026-03-06T09:14:50Z");
    }
}
