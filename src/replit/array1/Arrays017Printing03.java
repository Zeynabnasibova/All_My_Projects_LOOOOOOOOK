package replit.array1;
import java.util.Scanner;
public class Arrays017Printing03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }


        for(int i = 0; i < arr.length-2; i ++){

            String newArr = arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2];


            System.out.println(newArr);

        }




        }

    }

/*
The code provided in your main method will take in six Strings and save them into an array arr.

Print out the 3 neighboring items of the array in one line until the last line each line should contain 3 neighboring items of array element as displayed below

Example:

arr -> ["apple", "banana", "kiwi", "grape", "milk", "soda"]

Output:
apple, banana, kiwi
banana, kiwi, grape
kiwi, grape, milk
grape, milk, soda
 */