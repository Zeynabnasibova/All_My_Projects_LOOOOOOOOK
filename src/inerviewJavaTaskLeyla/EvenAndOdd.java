package inerviewJavaTaskLeyla;
import java.util.Scanner;
public class EvenAndOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num % 2 == 0){

            System.out.println("Even number");

        }else{

            System.out.println("Odd number");
        }
    }
}
