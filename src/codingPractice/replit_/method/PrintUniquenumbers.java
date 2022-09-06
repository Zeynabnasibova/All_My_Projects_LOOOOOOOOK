package codingPractice.replit_.method;

import java.util.Scanner;

public class PrintUniquenumbers {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int [] arr = new int [size];
        for(int i = 0; i < arr.length; i++ ){

            arr[i] = input.nextInt();
        }

                printUniqueNumbers(arr);

    }


public static void printUniqueNumbers(int [] arr){


    //int [] arr = new int [] {2, 5, 5, 6, 3, 6, 9, 34, 3};


    for(int i = 0; i < arr.length; i++){
        int count = 0;
        for(int j = 0; j < arr.length; j++){
            if(arr[i]==arr[j]){
                count++;
            }

            }

        if(count==1){

            System.out.println(arr[i]);
        }

    }

}

}
/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.`

Example:

input:[2, 5, 5, 6, 3, 6, 9, 34, 3]

output:
2
9
34
 */