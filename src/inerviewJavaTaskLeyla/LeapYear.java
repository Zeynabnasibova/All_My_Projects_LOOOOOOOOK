package inerviewJavaTaskLeyla;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
       // int year = 2013;

        if(year % 400 == 0 || year % 200 == 0 || year % 4 == 0 && year % 100 != 0 ){

            System.out.println("Leap year");

        }else{

            System.out.println("Not Leap year");
        }



    }
}
