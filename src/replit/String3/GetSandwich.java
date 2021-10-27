package replit.String3;

import java.util.Scanner;

public class GetSandwich {

    public static void main(String[] args) {

        /*
        A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread

output: jam

input: xxbreadjambreadyy

output: jam

input: xxbreadapple

output: nothing

input: breadbutterbread

output: butter
         */

        Scanner input = new Scanner(System.in);

        String sandwich = input.next();//breadjambread

        if(sandwich.startsWith("bread") && sandwich.endsWith("bread")) {

            System.out.println(sandwich.substring(5, sandwich.length() - 5));

        }else if(sandwich.substring(2).startsWith("bread") && sandwich.substring(sandwich.length() - 7).contains("bread") && sandwich.length() > 9){

            System.out.println(sandwich.substring(7,sandwich.length()-7));

        }else{

            System.out.println("nothing");
        }

    }
}
