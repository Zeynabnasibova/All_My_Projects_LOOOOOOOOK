package replit.array;

import java.util.Arrays;
import java.util.Scanner;
public class Arrays018Diving {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        float sumAll = 0.0f;

        float sum = 0.0f;

        double total = 0.0f;

        for(int i = 0; i < score.length;i++){
            System.out.println("Enter score for judge " + (i + 1) + ":");
            score[i] = input.nextInt();

            sumAll += score[i];

        }

        Arrays.sort(score);
        sum = sumAll - score[0] - score[6];

        System.out.println("Enter difficulty:");
        float difficultyNum = input.nextFloat();

        total = difficultyNum * sum * 0.6;

        System.out.printf(String.format("Total: %.2f", total));


    }

}
/*
In the sport of diving, seven judges award a score between 0 and 10, where each score may be a floating-point value.

The highest and lowest scores are thrown out, and the remaining scores are added together. The sum is then multiplied by the degree of difficulty for that dive.

The degree of difficulty ranges from 1.2 to 3.8 points. The total is then multiplied by 0.6 to determine the divers score.

Flow:

Accept the 7 scores from the judges
Accept the difficulty number
Display the final score
Enter score for judge 1:
1
Enter score for judge 2:
5
Enter score for judge 3:
5
Enter score for judge 4:
5
Enter score for judge 5:
5
Enter score for judge 6:
8
Enter score for judge 7:
9
Enter difficulty:
2.1
Total: 35.28
 */
