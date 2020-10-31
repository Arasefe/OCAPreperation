package ocaCybertek.set4;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question37 {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.of(2014,7,31,1,1);
        ldt.plusDays(30);
        ldt.plusMonths(1);
        System.out.println(ldt.format(DateTimeFormatter.ISO_LOCAL_DATE));
    }
}
