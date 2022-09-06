package javaTutorial.codesDope.practiceJava.javaOperators;

public class Q1 {

    public static void main(String[] args) {

        /*
        Length and breadth of a rectangle are 5 and 7 respectively. Write a program to calculate the area and perimeter of the rectangle.
         */

        int length = 5;

        int breadth = 7;

        int areaRectangle  = length * breadth;

        int perimeterRectangle = (length + breadth) * 2;

        System.out.println("area of the rectangle is : " + areaRectangle);

        System.out.println("perimeter of the rectangle is: " + perimeterRectangle);




    }
}
