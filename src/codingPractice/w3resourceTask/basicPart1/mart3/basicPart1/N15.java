package codingPractice.w3resourceTask.basicPart1.mart3.basicPart1;
import java.util.Scanner;
public class N15 {
    /*
    15.
    49. Write a Java program to accept a number and check the number is even or not. Prints 1 if the number is even or 0 if the number is odd. Go to the editor
Sample Output:

Input a number: 20
1
     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        N15 obj = new N15();
        System.out.println(obj.evenOdd(num));
    }
    public int evenOdd(int num){
        if(num % 2 ==0){
            return 1;
        }else{
            return 0;
        }
    }
}
