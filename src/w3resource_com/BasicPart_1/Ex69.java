package w3resource_com.BasicPart_1;

public class Ex69 {
    /*
    69. Write a Java program to extract the first half of a string of even length.
Test Data: Python
Sample Output:
Pyt
     */
    public static void main(String[] args) {
        String str = "Python";
        if (str.length() % 2 == 0) {
            String newStr = str.substring(0,str.length()/2);
            System.out.println(newStr);
        }
    }
}
