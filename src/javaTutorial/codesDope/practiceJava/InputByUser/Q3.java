package javaTutorial.codesDope.practiceJava.InputByUser;
import java.util.Scanner;
public class Q3 {

    public static void main(String[] args) {

        /*
        Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your rectangle length");
        double  lengthRectangle = input.nextDouble();
        System.out.println("Enter your rectangle breadth");
        double breadthRectangle = input.nextDouble();

        double area = lengthRectangle * breadthRectangle;

        System.out.println(area);


    }
}
