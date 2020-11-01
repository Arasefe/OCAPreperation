package udayan.Test1;

import java.time.LocalTime;

public class Question57 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(16, 40);
        String amPm = time.getHour() >= 12 ? "PM":(time.getHour() > 24) ? "AM":"";
        System.out.println(amPm);
    }
}
