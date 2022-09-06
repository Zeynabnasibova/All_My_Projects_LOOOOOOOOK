package javaTutorial.codesDope.practiceJava.InputByUser;
import java.util.Scanner;
public class Q8 {

    public static void main(String[] args) {

        /*
        Take 3 inputs from user and check :
all are equal
any of two are equal
( use && || )
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");

        int num1 = input.nextInt();

        System.out.println("Enter your second number");

        int num2 = input.nextInt();

        System.out.println("Enter your second number");

        int num3 = input.nextInt();

        if(num1 == num2 && num1 == num3 &&  num2 == num3 ){

            System.out.println("Same number");

        }else if(num1 == num2  || num1 == num3 || num2 == num3){

            System.out.println("Two number equalse");

        }else{

            System.out.println("Number not equals");
        }

    }
}
