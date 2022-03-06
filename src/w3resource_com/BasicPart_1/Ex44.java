package w3resource_com.BasicPart_1;
import java.util.Scanner;
/*
44. Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn.
Sample Output:

Input number: 5
5 + 55  + 555
 */
public class Ex44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = input.nextInt();
        //        5 + 5*10+5 + 5*10+5*10+5
       // int sum = num + (num * 10 + num) + (num * 10 + num)*10 + num ;
//        System.out.println(sum);
//        System.out.println(num + " + " + num + num + " + " + num + num + num + " = " + sum);
        int s= 0;//55
        int sum = 0;
        for(int i = 0; i < 4; i++){

            s = s * 10  + 5;//0 * 10 + 5 //5 * 10 + 5 // 55*10 + 5
            sum += s;

            System.out.print(s + " + ");
        }
        System.out.println(" = " + sum);
    }
}
