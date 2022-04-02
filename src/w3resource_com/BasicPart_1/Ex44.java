package w3resource_com.BasicPart_1;
import java.util.Scanner;
/*
44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5
5 + 55  + 555
 */
public class Ex44 {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        int newNum = num;
        // 5 * 10 + 5 = 55
        // 55 * 10 + 5 = 555
        String contain = "";

        for(int i = 0; i < 2; i++){
            num = num * 10 + newNum;
            contain += num + " + ";
        }
        System.out.println(newNum + " + " + contain.substring(0,contain.length()-2));
    }
}