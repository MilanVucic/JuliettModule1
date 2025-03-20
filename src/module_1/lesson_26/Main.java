package module_1.lesson_26;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date date = new Date(1740071585000L);
        // 1982398123978
        System.out.println(date);
        Date date2 = new Date(2025-1900,3,3);
        Date inThreeDays = new Date(date2.getTime() + 3 * 24 * 60 * 60 * 1000);
        System.out.println(date2);

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd/MM/yyyy HH:mm");
        System.out.println(sdf.format(date));
        System.out.println(sdf.format(date2));

        Calendar cal = Calendar.getInstance();
        cal.get(Calendar.YEAR);

        LocalDate localDate = LocalDate.of(2025, Month.AUGUST, 23);

        LocalDate inThreeDaysLD = localDate.plusDays(3);

        LocalTime localTime = LocalTime.now();

        LocalDateTime localDateTime = LocalDateTime.of(inThreeDaysLD, localTime);
        System.out.println(ZoneId.getAvailableZoneIds());
        String zoneId = null;
        for (String zone : ZoneId.getAvailableZoneIds()) {
            zoneId = zone;
            break;
        }
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, ZoneId.of(zoneId));
        System.out.println(zonedDateTime);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE dd/MM.yyyy HH:mm O");
        System.out.println(dtf.format(zonedDateTime));

        String dateInput = "Tuesday 26/08.2025 18:33 GMT+3";

        ZonedDateTime parsedDT = ZonedDateTime.parse(dateInput, dtf);
        System.out.println(parsedDT);
    }
}
