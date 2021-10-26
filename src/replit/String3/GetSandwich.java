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

        String between = sandwich.substring(sandwich.indexOf("bread"),sandwich.indexOf("bread"));

        System.out.println(between);
//sender = message.substring(message.indexOf("<")+1,message.indexOf(">"));
    }
}
