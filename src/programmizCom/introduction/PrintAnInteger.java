package programmizCom.introduction;
import java.util.Scanner;
public class PrintAnInteger {

    public static void main(String [] args){
/*
Java Program to Print an Integer (Entered by the User)
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println("Your entered number is: "+num);
    }
}
