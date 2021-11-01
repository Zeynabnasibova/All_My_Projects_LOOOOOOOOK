package B24InterviewTask.part5;
import java.util.Scanner;
public class Numbers_SwapNumbers {

    /*
    2. Numbers -- Swap Numbers
Swap two variable' values without using a third variable

     */

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);

        System.out.println("Enter number");

        int num1 = input.nextInt();// 2
        int num2 = input.nextInt();// 3

        num1 = num1 + num2;// 2 + 3 = 5

        num2 = num1 - num2; // 5 - 3 = 2

        num1 = num1 - num2; // 5 - 2 = 3

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);




    }


}
