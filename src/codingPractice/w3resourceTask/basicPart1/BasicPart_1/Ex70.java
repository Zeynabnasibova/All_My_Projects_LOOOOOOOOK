package codingPractice.w3resourceTask.basicPart1.BasicPart_1;
import java.util.Scanner;
public class Ex70 {
    /*
    70. Write a Java program to create a string in the form short_string + long_string + short_string from two strings. The strings must not have the same length.
Test Data: Str1 = Python
Str2 = Tutorial
Sample Output:
PythonTutorialPython
     */
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        String str1 = "Tutorial";
        String str2 = "Python";
        if(str1.length() > str2.length()){
            System.out.println(str2 + str1 +  str2 );
        }else{
            System.out.println(str1 + str2 + str1);
        }
    }
}
