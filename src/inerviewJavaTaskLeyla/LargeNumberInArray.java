package inerviewJavaTaskLeyla;
import java.util.Scanner;
public class LargeNumberInArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array size");
        int size = input.nextInt();

        int [] arrNumber = new int [size];

        for(int i = 0; i < size; i++){
            System.out.println("Enter number " + (i + 1));
            arrNumber[i] = input.nextInt();

        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arrNumber.length; i++){

            if(arrNumber[i] > max){

                max = arrNumber[i];
            }


        }
        System.out.println("Max number = " + max);

    }
}
