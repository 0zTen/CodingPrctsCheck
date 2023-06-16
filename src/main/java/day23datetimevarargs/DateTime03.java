package day23datetimevarargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTime03 {
    public static void main(String[] args) {
        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd-MMM-yyyy EEEE, HH:mm", Locale.ENGLISH);
        LocalDateTime ldt = LocalDateTime.now();
        String fdNewDateTime= dtf1.format(ldt);
        System.out.println(fdNewDateTime);
    }
}
