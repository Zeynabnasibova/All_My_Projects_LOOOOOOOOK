package w3resource_com.BasicPart_1;

public class Ex67 {
    /*
    67. Write a Java program to insert a word in the middle of the another string.
Insert "Tutorial" in the middle of "Python 3.0", so result will be Python Tutorial 3.0
Sample Output:
Python Tutorial 3.0
     */
    public static void main(String[] args) {
 String str1 = "Python 3.0";
 String str2 = "Tutorial";
 String newStr = str1.substring(0,str1.length() / 2 + 1 ) + " " + str2 + str1.substring(str1.length()/2);
        System.out.println(newStr);
    }
}
