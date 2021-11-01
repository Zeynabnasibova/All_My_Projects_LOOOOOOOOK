package SaimJavaInterviewCodingTasks;

import java.util.ArrayList;
import java.util.List;

public class NumbersDivisibleBy3or5or15third {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++)

            list.add(i + 1);


        System.out.print("Divisible By 15: ");

        list.forEach(p -> {
            if (p % 15 == 0 && p % 3 == 0) System.out.print(p + " ");
        });

        System.out.print("\nDivisible By 5: ");

        list.forEach(p -> {
            if (p % 5 == 0 && p % 15 != 0) System.out.print(p + " ");
        });

        System.out.print("\nDivisible By 3: ");

        list.forEach(p -> {
            if (p % 3 == 0 && p % 15 != 0) System.out.print(p + " ");
        });

    }
}
    /*
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.

if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section

if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section

if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section

ex:

OutPut:

Divisible By 15 15 30 45 60 75 90

Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100

Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99
 */