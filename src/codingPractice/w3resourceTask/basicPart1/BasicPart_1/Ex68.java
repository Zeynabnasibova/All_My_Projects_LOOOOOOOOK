package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

public class Ex68 {
    /*
    68. Write a Java program to create a new string of 4 copies of the last 3 characters of the original string. The length of the original string must be 3 and above.
Sample Output:
3.03.03.03.0
     */
    public static void main(String[] args) {
        String str = "Python 3.0";
        String newStr = str.substring(str.length()-3) + str.substring(str.length()-3) + str.substring(str.length()-3);
        System.out.println(newStr);
    }
}
