package replit.methodsWithReturn;
import java.util.Scanner;
public class At3rdChar {

    public static String at3(String str1, String str2){

        String strNew = str1.substring(0,3) + str2 + str1.substring(3);

        return strNew;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(at3(in.next(), in.next()));
    }
}
/*
at3 accepts two strings and returns a string.

The first string is the one that will be manipulated. At the 3rd char position of target you will insert the word argument.

Example:

at3("longword","foo")

return: "lonfoogword"

at3("blabla","a")

 */