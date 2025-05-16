package zad2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {

    public static void localDate() {
        LocalDate localDate = LocalDate.of(2019,12,10);
        LocalDate modifyLocalDate = localDate.plusYears(1).plusMonths(1).plusDays(1);
        System.out.println("Data1: "+modifyLocalDate);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println("Data2: "+localDate.format(formatter));
        String dateToParse = "2012/12/12";
        System.out.println("Data3: "+dateToParse);
    }
}
