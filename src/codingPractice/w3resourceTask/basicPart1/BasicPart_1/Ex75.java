package codingPractice.w3resourceTask.basicPart1.BasicPart_1;
import java.util.Scanner;
public class Ex75 {
    /*
75. Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2.
Test Data: array = 50, -20, 0, 30, 40, 60, 10
Sample Output:
false
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your array size");
        int arrLength = input.nextInt();
        int [] arr = new int [arrLength];
        for(int i = 0;i < arrLength; i++){
            System.out.println("Enter your " + (1+i) + " number");
            arr[i] = input.nextInt();

        }
        System.out.println(same(arr));
    }
    public static String same(int [] arr){
        if(arr.length >= 2 && arr[0] == arr[arr.length-1]){
            return "same";
        }else{
            return "not same";
        }
    }

}
