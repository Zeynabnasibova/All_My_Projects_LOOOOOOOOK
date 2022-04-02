package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex72 {
    /*
    72. Write a Java program to create a new string taking first three characters from a given string. If the length of the given string is less than 3 use "#" as substitute characters.
Test Data: Str1 = " "
Sample Output:
###
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word");
        String str = input.nextLine();
        String newStr = "";
        if(str.length() >= 3){
            newStr = str.substring(0,3);
        }else if (str.length() == 2){
            newStr = str.substring(0) + "#";
        }else if(str.length() == 1){
            newStr = str.substring(0) + "##";
        }else{
            newStr = "###";
        }
        System.out.println(newStr);
    }
}