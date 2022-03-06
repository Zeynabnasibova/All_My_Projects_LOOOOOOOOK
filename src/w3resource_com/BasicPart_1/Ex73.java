package w3resource_com.BasicPart_1;

public class Ex73 {
    /*
    73. Write a Java program to create a new string taking first and last characters from two given strings. If the length of either string is 0 use "#" for missing character.
Test Data: str1 = "Python"
str2 = " "
Sample Output:
P#
     */
    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "";
        if(str1.length() == 0 ){
            System.out.println("#"+ str2.charAt(str2.length()-1));
        }else if(str2.length() == 0){
            System.out.println(str1.charAt(0) + "#");
        }else{
            System.out.println(str1.charAt(0) + str2.charAt(str2.length()-1));
        }
    }
}
