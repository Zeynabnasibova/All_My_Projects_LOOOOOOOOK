package replit.statements2;

import java.util.Scanner;

public class HappyValleySchoolSystem {

    public static void main(String[] args) {

        /*
        In the Happy Valley School System, children are classified by age as follows:

Assume only positive numbers are given

less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible

Given age print out the category the student would fall under

Example:

Enter age:
8

elementary
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = input.nextInt();


        if(age < 2){
            System.out.println("ineligible");
        } else if( age == 2){
            System.out.println("toddler");
        }else if( age >= 3 && age <= 5){
            System.out.println("early childhood");
        }else if(age >= 6 && age <= 7){
            System.out.println("young reader");
        }else if(age >= 8 && age <= 10){
            System.out.println("elementary");
        }else if(age == 11 && age == 12){
            System.out.println("middle");
        }else if(age == 13){
            System.out.println("impossible");
        }else if(age >= 14 && age <=16){
            System.out.println("high school");
        }else if(age >= 17 && age <= 18){
            System.out.println("scholar");
        }else if(age > 18){
            System.out.println("ineligible");
        }
    }
}