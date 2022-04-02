package w3resource_com.BasicPart_1;
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) {
Scanner input = new Scanner (System.in);
        System.out.println("Enter your array of integer length");
        int arrLength = input.nextInt();
        int [] arr = new int [arrLength];
        for(int i = 0; i < arrLength; i++){
            System.out.println("Enter your nums" + (i + 1));
            arr[i] = input.nextInt();
        }
        if(arr.length >= 2 && arr[0] == arr[arr.length-1]){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}