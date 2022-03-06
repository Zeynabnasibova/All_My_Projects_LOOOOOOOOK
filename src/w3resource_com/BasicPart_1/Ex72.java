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
        Scanner input = new Scanner(System.in);
        String str1 = input.next();
        if( str1.length() >= 3){
            System.out.println(str1.substring(0,3));
        }else if(str1.length() == 1) {
            System.out.println(str1.substring(0) + "##");
        }else if(str1.length()==2){
            System.out.println(str1.substring(0)+ "#");
        }else{
            System.out.println("###");
        }
    }
}
