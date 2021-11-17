package saimDayByDay.day39_WrapperClass;

import java.util.Scanner;

public class ParseExample {

    public static void main(String[] args) {
        //convert the String character to int
        String year = "2009";
        System.out.println(year + 1);

        int intYear = Integer.parseInt(year);

        System.out.println(year);
        System.out.println(intYear);

        System.out.println(year+1);
        System.out.println(intYear+1);

        /*
        Ask the user to enter some text
        I am x years olds
        In 5 years you will be: $age
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = input.nextLine();
        String [] textArr = text.split(" ");
        // String  agetext = text.split(" ")[2];

        String age = textArr[2];
        int getage = Integer.parseInt(age);

        System.out.println(getage + 5);







    }
}
