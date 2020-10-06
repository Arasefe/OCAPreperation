package entuware;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question7 {
    public static void main(String[] args) {
        LocalDate d1=LocalDate.parse("2020-08-29", DateTimeFormatter.ISO_DATE);
        LocalDate d2=LocalDate.of(2020,8,29);
        LocalDate d3=LocalDate.now();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}
