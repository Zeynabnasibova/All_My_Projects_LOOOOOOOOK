package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex57 {

    public static void main(String[] args) {


        /*
         Write a Java program to accepts an integer and count the factors of the number. Go to the editor
Sample Output:

Input an integer: 25
3
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number");

        int number = input.nextInt();

        int fact = 0;



        for(int i = 1; i <= number; i++){

            if(number % i == 0){

               fact ++;

                //System.out.println(i + "");


            }

        }
        System.out.println(fact);//

    }
}
