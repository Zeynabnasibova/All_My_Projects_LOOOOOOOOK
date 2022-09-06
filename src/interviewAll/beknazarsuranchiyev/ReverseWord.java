package interviewAll.beknazarsuranchiyev;

public class ReverseWord {

    /**
     3.Reverse words. Write a method that will take a string as an argument. The method will reverse the position of words and return it.
     */

    public static String reverse(String str) {

        String [] arr = str.split(" ");

        String reverse = "";

        for(int i = arr.length-1; i >= 0; i--){

            reverse += arr[i] + " ";

        }
        return reverse;
    }
    public static void main (String [] args){

        String str = "Hello world";

        System.out.println(reverse(str));


    }
}
