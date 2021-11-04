package replit.methodsWithReturn;

import java.util.Scanner;

public class RemoveFirstChar {

public static String removeFirst(String str){

    String newStr = str.substring(1);

    return newStr;
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(removeFirst(in.next()));
    }

}

/*
The method accepts a string and returns a string without the first character

Example:

removeFirst("aaa")

returns "aa"
 */