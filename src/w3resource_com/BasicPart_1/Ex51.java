package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex51 {
    /*
    51. Write a Java program to convert a string to an integer in Java.
Sample Output:
Input a number(string): 25
The integer value is: 25
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      String strNum = input.nextLine();
      int num = Integer.parseInt(strNum);
        System.out.println(num);
    }
}
