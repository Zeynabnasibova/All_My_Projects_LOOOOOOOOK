package mart.w3resourceTask.basicPart1.mart2.basicPart1;
import java.util.Scanner;
public class N6 {
    /*
    6.
    32. Write a Java program to compare two numbers. Go to the editor
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output
25 != 39
25 < 39
25 <= 39
     */

    public static void main(String [] args){
Scanner input = new Scanner(System.in);
int num1 = input.nextInt();
int num2 = input.nextInt();

if( num1 != num2){
    System.out.println(num1 + " != " + num2);
}if (num1 < num2 ){
    System.out.println(num1 + " < " + num2);
}if(num1 <= num2){
            System.out.println(num1 + " <= " + num2);
        }

}
}