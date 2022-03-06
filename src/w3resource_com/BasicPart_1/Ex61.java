package w3resource_com.BasicPart_1;

public class Ex61 {

    public static void main(String[] args) {
        /*
Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd
         */
            String str = "dsaf";
            String reverse = "";
            for(int i = str.length()-1;i >= 0; i--){
                reverse += str.charAt(i);
            }
        System.out.println(reverse);
    }
}
