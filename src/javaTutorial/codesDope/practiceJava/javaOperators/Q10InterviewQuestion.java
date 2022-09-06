package javaTutorial.codesDope.practiceJava.javaOperators;

public class Q10InterviewQuestion {

    public static void main(String[] args) {


        /*
        Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
1 - first program by using a third variable
2 - second program without using any third variable
( Swapping means interchanging the values of the two variables E.g.- If entered value of x is 5 and y is 10 then after swapping the value of x and y should become 10 and 5 respectively.)
         */


        int a = 6;

        int b = 8;

        int c = a;//6

        a = b; //8

        b = c; //6

        System.out.println(a);

        System.out.println(b);



        System.out.println();

        int x = 6;

        int y = 8;

        x = y - x; //8 - 6 = 2

        y = y - x; //8 - 2 = 6

        x = y + x;// 6 + 2 = 8

        System.out.println(x);

        System.out.println(y);




    }
}
