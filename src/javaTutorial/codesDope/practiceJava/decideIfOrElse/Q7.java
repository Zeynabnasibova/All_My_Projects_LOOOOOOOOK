package javaTutorial.codesDope.practiceJava.decideIfOrElse;
import java.util.Scanner;
public class Q7 {

    public static void main(String[] args) {

        /*
        Write a program to print absolute valaue of a number entered by user. E.g.-
INPUT: 1        OUTPUT: 1
INPUT: -1        OUTPUT: 1
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");

         int num = input.nextInt();

         if(num < 0 ){

             System.out.println(-1 * num);

         }else{

             System.out.println(num);
         }



    }
}
