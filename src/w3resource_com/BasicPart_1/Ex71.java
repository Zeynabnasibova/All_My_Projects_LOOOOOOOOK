package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Ex71 {
    /*
    71. Write a Java program to create the concatenation of the two strings except removing the first character of each string. The length of the strings must be 1 and above.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:
ythonutorial
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        if(str1.length() >= 1 && str2.length()>=1 ) {
            System.out.println(str1.substring(1) + str2.substring(1));
        }
    }
}
