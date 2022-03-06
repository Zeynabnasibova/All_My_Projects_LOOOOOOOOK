package OCA1Z0_808F;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class N16 {
    public static void main(String[] args) {

        LocalDateTime dt =  LocalDateTime.of(2014,7,31,1,1);
 //       System.out.println(dt);
        dt.plusDays(30);
        dt.plusMonths(1);
        System.out.println(dt);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
       dt =  dt.plusDays(30);
    dt = dt.plusMonths(1);
    dt = dt.plusHours(5);
        System.out.println(dt);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
    }
}
