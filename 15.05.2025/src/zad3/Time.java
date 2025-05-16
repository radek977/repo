package zad3;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {

    public static void localTime() {
        LocalTime localTime = LocalTime.of(7,01);
        LocalTime modifyLocalTime = localTime.plusMinutes(1);
        System.out.println(modifyLocalTime);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm a");
        System.out.println(formatter.format(localTime));
    }
}
