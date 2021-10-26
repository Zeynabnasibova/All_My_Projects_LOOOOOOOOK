package replit.variable1;

import java.util.Scanner;

public class Time {
    /*
    In this assignment, you will write code to put together time of day.

Like this: 12:24:33 PM

Declare variables: hour, minute, second that can hold int values.
Declare amOrPm variable that can hold a String ("AM" or "PM")
Instructor will set different values to your variables
Using the variables and concatenation, print values in the format mentioned above.
     */
    public static void main(String[] args) {


    int hour = 12;
    int minute = 24;
    int second = 33;
        String amOrPm = "PM";

        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner scan = new Scanner(System.in);
        hour   = scan.nextInt();
        minute = scan.nextInt();
        second = scan.nextInt();
        amOrPm = scan.next();
        //#############################

        //2. WRITE YOUR CODE HERE:
        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);




    }
}
