package codingPractice.replit_.methodsWithReturn;
import java.util.Scanner;
public class IsEven {



public static boolean isEven(int num){

    if(num % 2 == 0){
        return true;
    }else{

        return false;
    }
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }



}
/*
isEven accepts a number and checks if it is even. If the given number is even return true, otherwise return false.

Examples:

isEven(1) --> false

isEven(8) --> true
 */