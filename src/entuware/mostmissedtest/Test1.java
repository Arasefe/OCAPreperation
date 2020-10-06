package entuware.mostmissedtest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test1 {
    public static void main(String[] args) {
        String date= LocalDate.parse("2014-04-20").format(DateTimeFormatter.ISO_DATE);  // exception
        System.out.println(date);

        String date1= LocalDate.parse("12:25").format(DateTimeFormatter.ISO_TIME);      //
        System.out.println(date1);

        String date2= LocalDate.parse("2014-04-20").format(DateTimeFormatter.ISO_DATE_TIME);  // exception
        System.out.println(date2);
    }
}
