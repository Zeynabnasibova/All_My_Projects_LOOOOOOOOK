package codingPractice.w3resourceTask.basicPart1.BasicPart_1;
import java.util.Scanner;
public class Ex76 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first array length");
        int arr1Length = input.nextInt();
        int [] arr1 = new int [arr1Length];
        for(int i = 0; i < arr1Length; i++){
            System.out.println("Enter your number" + (i + 1));
            arr1[i]  = input.nextInt();
        }

        System.out.println("Enter second array length");
        int arr2Length = input.nextInt();
        int [] arr2 = new int [arr2Length];
        for (int i = 0; i < arr2Length; i++){
            System.out.println("Eneter your number " + (i + 1));
             arr2[i] = input.nextInt();
        }
        if(arr1.length >= 2  && arr2.length >= 2 && arr1[0] == arr2[0] || arr1[arr1.length-1] == arr2[arr2.length-1]){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
     
    }
}