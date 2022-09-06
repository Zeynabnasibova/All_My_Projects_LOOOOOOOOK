package codingPractice.replit_.statements2;

import java.util.Scanner;

public class WeekDays {

    public static void main(String[] args) {

        /*
        Write a program that will print a week days according to the day number. Use Switch statement. If an invalid day is entered print: "Not a valid day"

Example

Enter number:
1

Output: Monday

Enter number:
7

Output: Sunday
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tustday");
                break;
            case 3:
                System.out.println("Wendsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Not a valid day");
        }
    }
}
