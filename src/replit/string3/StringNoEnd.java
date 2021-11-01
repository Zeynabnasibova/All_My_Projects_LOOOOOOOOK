package replit.string3;
import java.util.Scanner;
public class StringNoEnd {

    public static void main(String[] args) {

        /*
        Given a String txt print the value without the last letter

Ex:

Input:
foo

Output:
fo

Input:
run

Output:
ru

Hint: Use substring() and length()
         */
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String newStr = str.substring(0,str.length()-1);
        System.out.println(newStr);

    }
}
