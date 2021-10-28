package replit.loops;
import java.util.Scanner;
public class PrintEvenFrom89To20 {

    public static void main(String[] args) {

        /*
Write a for loop that prints all even integers from 80 through and including 20. Seperate each number with a space
         */


        Scanner input = new Scanner(System.in);

        String num = "";

        for(int i = 80; i >= 20; i--){

            if(i % 2 == 0){

                num += i + " ";
              //  System.out.print(i + " ");


            }

        }
        System.out.println(num.trim());
    }
}
