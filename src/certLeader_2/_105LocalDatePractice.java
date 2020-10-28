package certLeader_2;

import java.time.LocalDate;

public class _105LocalDatePractice {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012,02,32);
        date.plusDays(10);
        System.out.println(date);
    }
}
