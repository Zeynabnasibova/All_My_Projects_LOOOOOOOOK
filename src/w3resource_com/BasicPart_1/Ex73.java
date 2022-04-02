package w3resource_com.BasicPart_1;

import java.util.Scanner;

public class Ex73 {
    /*
    73. Write a Java program to create a new string taking first and last characters from two given strings. If the length of either string is 0 use "#" for missing character.
Test Data: str1 = "Python"
str2 = " "
Sample Output:
P#
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter your word1");
        String str1 = input.nextLine();
        System.out.println("Enter your word2");
        String str2 = input.nextLine();
        String newStr = "";
        if(str1.length()>0 && str2.length()>0){
            newStr = "" + str1.charAt(0) + str2.charAt(str2.length()-1);
        }else if(str1.length() > 0 && str2.length() == 0){
            newStr = "" + str1.charAt(0) + "#";
        }else if(str1.length()==0 && str2.length()>0){
            newStr = "" + "#" + str2.charAt(str2.length()-1);
        }else{
            newStr = "##";
        }

        System.out.println(newStr);

    }
}