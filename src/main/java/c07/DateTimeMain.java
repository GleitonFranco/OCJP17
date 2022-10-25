package c07;

import java.time.*;

public class DateTimeMain {
    public static void main(String... args) {
        daylightSavingTime();
    }

    public static void dateTime() {
        var d1 = LocalDate.now();
        var t1 = LocalTime.now();
        var dt1 = LocalDateTime.now();
        var zdt1 = ZonedDateTime.now();
        var d2 = LocalDate.of(1973, Month.SEPTEMBER, 29);
        var t2 = LocalTime.of(6,15,40,200);
        var dt2 = LocalDateTime.of(d2, t2);
        var z1 = ZoneId.of("America/Fortaleza");
        var zdt2 = ZonedDateTime.of(2022, 1, 20, 6, 15, 40, 200, z1);
        var zdt3 = ZonedDateTime.of(d2, t2, z1);
        var zdt4 = ZonedDateTime.of(dt2, z1);
        System.out.println(d1);
        System.out.println(t1);
        System.out.println(dt1);
        System.out.println(zdt1);
        System.out.println(d2.getDayOfWeek());
        System.out.println(z1);
    }

    public static void daylightSavingTime() {
        var zone = ZoneId.of("US/Eastern");
        var dtSpring = LocalDateTime.of(2022, Month.MARCH, 13, 1, 59);
        var zt = ZonedDateTime.of(dtSpring, zone);
        System.out.println("*** SPRING ***");
        System.out.println(zt);
        System.out.println(zt.plusHours(1));
        System.out.println(zt);
        System.out.println(zt.plusMinutes(1));
        var dtFall = LocalDateTime.of(2022, Month.NOVEMBER, 6, 1, 59);
        var ztFall = ZonedDateTime.of(dtFall, zone);
        System.out.println("*** FALLS ***");
        System.out.println(ztFall);
        System.out.println(ztFall.plusHours(1));
        System.out.println(ztFall.plusMinutes(1));
    }

}
