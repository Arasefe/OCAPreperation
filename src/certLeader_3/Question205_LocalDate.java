package certLeader_3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Question205_LocalDate {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2022,1,30);
        date.plusDays(10);
        System.out.println(date);
    }

}
