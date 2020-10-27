package muhtarSets.set4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Question38 {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.now();
        LocalDate date2=LocalDate.of(2014,10,24);
        LocalDate date3=LocalDate.parse("2014-10-24", DateTimeFormatter.ISO_DATE);

        System.out.println("date 1"+date1);
        System.out.println("date 2"+date1);
        System.out.println("date 3"+date1);
    }
}
