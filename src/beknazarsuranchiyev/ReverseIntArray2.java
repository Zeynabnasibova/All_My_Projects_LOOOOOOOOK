package beknazarsuranchiyev;

public class ReverseIntArray2 {

    /**
     2.Array reverse. Write a method that will take an array as an argument and reverse it
     */

    public static void main(String[] args) {
String reverse = "";
     int [] arr = new int [] {1, 2, 3,4};

        for(int i = arr.length-1; i >= 0; i--){

            reverse += arr[i] + " ";
          //  System.out.print(arr[i] + " ");
        }
        System.out.println(reverse);
    }
}
