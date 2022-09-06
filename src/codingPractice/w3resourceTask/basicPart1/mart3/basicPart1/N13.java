package codingPractice.w3resourceTask.basicPart1.mart3.basicPart1;

import java.time.LocalDateTime;
import java.util.Date;

public class N13 {
    /*
    13.

    46. Write a Java program to display the system time. Go to the editor
Sample Output:

Current Date time: Fri Jun 16 14:17:40 IST 2017
     */
public static void main(String [] args){
    LocalDateTime today = LocalDateTime.now();
    System.out.println(today);
    Date date = new Date();
    System.out.println(date);
}
}
