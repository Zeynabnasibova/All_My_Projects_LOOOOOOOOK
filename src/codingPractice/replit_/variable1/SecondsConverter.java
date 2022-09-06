package codingPractice.replit_.variable1;
import java.util.Scanner;
public class SecondsConverter {

    public static void main(String[] args) {

        /*
        Write a program that outputs the number of hours, minutes, and seconds that corresponds to input total seconds.

Create a Scanner object
Declare int variables inputSeconds, hours, minutes, seconds
Ask user enter seconds by printing:
"Enter seconds:"
Using %(remainder) and / operators, find out how many whole hours, minutes and seconds are in inputSeconds.
Assign values to the hours, minutes, seconds variables
Display the result.
Example:

Enter seconds:
3695
1 hours, 1 minutes, and 35 seconds
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = input.nextInt();

        int hours = 1;
        int minute = 1;
        int seconds = 35;

        hours = inputSeconds / 3600;
        inputSeconds = inputSeconds % 3600;


        minute = inputSeconds / 60;
        inputSeconds = inputSeconds % 60;

        seconds = inputSeconds;

        System.out.println(hours + " hours, " + minute + " minutes, " + "and " + seconds + " seconds");






    }
}
