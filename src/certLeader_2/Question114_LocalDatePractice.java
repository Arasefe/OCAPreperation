package certLeader_2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question114_LocalDatePractice {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        LocalDate date2=LocalDate.of(6,20,2014);// First year then month then day of month
        //LocalDate date2=LocalDate.of(2020,11,5);
        LocalDate date3=LocalDate.parse("2020-12-05", DateTimeFormatter.ISO_DATE);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
        System.out.println("date3 = " + date3);
    }
}
