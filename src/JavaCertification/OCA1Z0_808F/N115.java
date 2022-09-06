package JavaCertification.OCA1Z0_808F;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class N115 {

    public static void main(String[] args) {

        LocalDate date1  = LocalDate.now();
        System.out.println(date1);

        LocalDate date3  = LocalDate.parse("2014-06-20", DateTimeFormatter.ISO_DATE);
        System.out.println(date3);

//        LocalDate date2  = LocalDate.of(6,20,2014);
//        System.out.println(date2);

        LocalDate date2  = LocalDate.of(2014,06,20);
        System.out.println(date2);


    }
}
class N3{
    public static void main(String[] args) {
        String date = LocalDate.parse(("2014-06-20")).format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(date);
    }

}