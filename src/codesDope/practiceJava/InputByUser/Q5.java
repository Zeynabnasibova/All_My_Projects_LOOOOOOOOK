package codesDope.practiceJava.InputByUser;
import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {

        /*
        Take side of a square from user and print area and perimeter of it.
         */
      Scanner input = new Scanner(System.in);

        System.out.println("Enter side of square");

        int side = input.nextInt();

        int areaOfSquare = side * side;
        int perimeterSquare = 4 * side;

        System.out.println(areaOfSquare);
        System.out.println(perimeterSquare);





    }
}
