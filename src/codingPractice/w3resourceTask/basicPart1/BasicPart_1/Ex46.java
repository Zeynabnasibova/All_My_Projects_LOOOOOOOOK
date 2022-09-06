package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

import java.util.Date;

public class Ex46 {
    /*
    46. Write a Java program to display the system time. Go to the editor
Sample Output:

Current Date time: Fri Jun 16 14:17:40 IST 2017
     */
    public static void main(String[] args) {
//  LocalDate date = LocalDate.now();
//        System.out.println(date);
//        LocalDateTime today = LocalDateTime.now();
//        System.out.println(today);
        Date t = new Date();
        System.out.println(t);
    }
}
