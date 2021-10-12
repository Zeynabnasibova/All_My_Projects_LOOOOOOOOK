package java_Interview_CodingTask_Implementation_1_B24;

import java.util.Scanner;

public class Q8 {

    /*
    Q8:String -- sum of digits in a string: Write a method that can return the sum of the digits in a string.

     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        getvalues(s1);
    }

    public static void getvalues(String s1) {

        int sum = 0;

        for (int i = 0; i < s1.length(); i++) {

            char a = s1.charAt(i);

            if (Character.isDigit(a)) {

                int b = Integer.parseInt(String.valueOf(a));

                sum = sum + b;
            }
        }
        if (sum == 0) {

            System.out.println(-1);

        } else {
            System.out.println(sum);

        }
    }
}