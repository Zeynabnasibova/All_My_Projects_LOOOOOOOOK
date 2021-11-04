package replit.methodsWithReturn;
import java.util.Scanner;
public class locks3 {

public static boolean threeLocks(boolean a, boolean b, boolean c){

    if(a && b || c){
        return true;
    }else{
        return false;
    }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));
    }
}
/*
threeLocks accepts 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.

Hint: See truth table
 */
