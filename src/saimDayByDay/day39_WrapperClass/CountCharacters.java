package saimDayByDay.day39_WrapperClass;
import java.util.Scanner;
public class CountCharacters {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = input.next();

        int upper = 0, lower = 0, num = 0, other = 0;

        for(char each : email.toCharArray()){ // toCharArray method gives the char []

            if(Character.isUpperCase(each)){
                upper++;
            } else if (Character.isLowerCase(each)){
                lower++;
            } else if(Character.isDigit(each)){
                num++;
            } else {
                other++;
            }

        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
        System.out.println("Digits: " + num);
        System.out.println("Other: " + other);


    }
}
  /*
Task:
create a new class called CountCharacters
	Ask the user to enter their email
	count how many uppercase letter
	count how many lowercase letters
	count how many numbers
	count all other character
	Challenge: instead of making 4 counting variables, use 1 array
     */
