package replit.statements2;

import java.util.Scanner;

public class ThreeNums {


    /*
Write a program that checks for the biggest of 3 numbers. you get 3 int variables: n1 , n2 and n3

if n1 is biggest output: "n1 is bigger"
if n2 is biggest output: "n2 is bigger"
if n3 is biggest output: "n3 is bigger"
Example:

1
2
1

n2 is bigger

3
2
1

n1 is bigger

3
2
30

n3 is bigger
     */

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();


        //1  1   3+  3+  2  2
        //2  3+  1   2   3+ 1
        //3+ 2   2   1   1  3+

        if(num3 > num1 && num3 > num2){
            System.out.println("num3 is bigger");

        }else if(num2 > num1 && num2 > num3){
            System.out.println("num2 is bigger");
        }else if(num1 > num2 && num1 > num3) {
            System.out.println("num1 is bigger");

        }
    }
}
