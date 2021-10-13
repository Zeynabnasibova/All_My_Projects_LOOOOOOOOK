package codesDope.practiceJava.decideIfOrElse;
import java.util.Scanner;
public class Q9 {

    public static void main(String[] args) {


        /*
        Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.
         */


        Scanner input = new Scanner(System.in);

        System.out.println("Have you medical cause?");

       String str = input.next();

        if(str.equalsIgnoreCase("yes")){

            System.out.println("You can sit");
        }else{

            System.out.println("You can not sit");
        }

    }
}
