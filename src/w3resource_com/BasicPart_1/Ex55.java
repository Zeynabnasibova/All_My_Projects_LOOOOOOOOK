package w3resource_com.BasicPart_1;

import java.util.Scanner;
public class Ex55 {
    /*
    55. Write a Java program to convert seconds to hour, minute and seconds. Go to the editor
Sample Output:

Input seconds: 86399
23:59:59
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input seconds");
        int seconds = input.nextInt();
        int second = seconds % 60;
        int hour = seconds / 60;
        int minute = hour % 60;
        hour = hour / 60;

        System.out.println(hour + ":" + minute + ":" + second );
    }
}
