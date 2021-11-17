package B24InterviewTask.part7;

public class Number_Reverse_negative_number {

    public static void main(String[] args) {

         int number = -123;

        System.out.println(reverse(number));

    }
        public static int reverse(int number){

          //  int number = -123;
            int remainder = 0;

            int reverse = 0;

            while (number != 0) {

                remainder = number % 10;

                reverse = reverse * 10 + remainder;

                number = number / 10;

            }

          return reverse;

        }
    }

/*
1. Number -- Reverse negative number
Write a return method that can reverse negative number and return it as int.

 */