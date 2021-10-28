package replit.loops;
import java.util.Scanner;
public class CountTriples {

    public static void main(String[] args) {

        /*
        We'll say that a "triple" in a string is a char appearing three times in a row. Print out the number of triples in the given string. The triples may overlap.

Example:

input: abcXXXabc

output: 1

Example:

input: xxxabyyyycd

output: 3

Example:

input: java

output: 0
         */


        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        int count = 0;

        for(int i = 0;i < str.length()-2; i++){
          //  if(str.substring(i,i+1).equals(str.substring(i+1,i+2)) && str.substring(i+1,i+2).equals(str.substring(i+2,i+3))){
if(str.charAt(i)==str.charAt(i + 1) && str.charAt(i +1) == str.charAt(i +2)){
                count++;
            }
        }

        System.out.println(count);
    }
}
