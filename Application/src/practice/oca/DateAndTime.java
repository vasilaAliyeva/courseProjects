package practice.oca;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now()); //utc 0 + 4
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());


        System.out.println("---------------------------------------------------");
        //immutabledi, eger plusmonh ve s methodlardan istifade edirikse yeni bir deyisene beraber edirik, minusmonths ve s.
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(LocalDateTime.of(2025, Month.DECEMBER, 8, 23, 9, 9, 9));

        //PERIOD

        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        Period period = Period.ofMonths(1).plusDays(9);               // create a period
        performAnimalEnrichment(start, end, period);
        System.out.println("---------------------------------------------------");

//        LocalDate has toEpochDay(), which is the number of days since January 1, 1970.
//        LocalDateTime has toEpochTime(), which is the number of seconds since January 1, 1970.
//        System.out.println(LocalDateTime.now().toEpochSecond( ZoneId.ofOffset("UTC")));

        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(date.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("---------------------------------------------------");

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(dateTime));     // 1/20/20
        System.out.println(shortDateTime.format(date));      // 1/20/20
//        System.out.println(shortDateTime.format(time)); // UnsupportedTemporalTypeException

        System.out.println("---------------------------------------------------");

        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM YYYY 'VAXT' hh:mm");
        System.out.println(dateTime.format(f));

        System.out.println("---------------------------------------------------");

        //PARCING DATA
        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015", f1);
        LocalTime time1 = LocalTime.parse("11:22");
        System.out.println(date1);          // 2015-01-02
        System.out.println(time1);          // 11:22

        //HH - 24 HOURS hh- 12 hours system


        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if (a == "2cfalse") System.out.println("==");
        if (a.equals("2cfalse")) System.out.println("equals");
    }

    private static void performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {       // uses the generic period
        LocalDate upTo = start;
        while (upTo.isBefore(end)) {
            System.out.println("give new toy: " + upTo);
            upTo = upTo.plus(period);     // adds the period
        }
    }
}
