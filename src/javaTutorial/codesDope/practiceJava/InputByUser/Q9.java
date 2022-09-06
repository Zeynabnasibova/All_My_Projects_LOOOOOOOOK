package javaTutorial.codesDope.practiceJava.InputByUser;
import java.util.Scanner;
public class Q9 {

    public static void main(String[] args) {

        /*

Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your firstNum");
        int num1 = input.nextInt();
        System.out.println("Enter your secnd number");
        int num2 = input.nextInt();

        if(num1 < 50 && num1 < num2){

            System.out.println(true);

        }else{

            System.out.println(false);

        }

    }
}
