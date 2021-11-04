package replit.method;
import java.util.Scanner;
public class SimpleCalculator {

public static void plus(){
    Scanner input = new Scanner(System.in);
    System.out.println("enter first number:");
    int num1 = input.nextInt();
    System.out.println("enter second number:");
    int num2 = input.nextInt();
    int result = num1 + num2;
    System.out.print("result: " + result);
}
public static void main(String [] args){

    plus();
}
}
/*
Implement the plus method. The return is void and has no arguments.

The method should ask the user to input two numbers, then it will add them and print the result.

Hint: Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
 */