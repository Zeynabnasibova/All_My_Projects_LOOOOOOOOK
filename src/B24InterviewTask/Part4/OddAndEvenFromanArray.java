package B24InterviewTask.Part4;

public class OddAndEvenFromanArray {


    public static void main(String[] args) {


        int number[] = {1, 2, 5, 6, 3, 2};

        System.out.println("Odd Numbers:");

        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 != 0) {

                System.out.println(number[i]);
            }
        }
        System.out.println("Even Numbers:");

        for (int i = 0; i < number.length; i++) {

            if (number[i] % 2 == 0) {

                System.out.println(number[i]);
            }
        }
    }
}