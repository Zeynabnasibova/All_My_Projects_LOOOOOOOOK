package B24InterviewTask.Part3;

import java.util.Arrays;

public class MoveZerosRToTheEndArray {
    /*
    5. Array -- Move zeros to the end
- Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */

        public static void main (String[]args) {

            int [] numbers = new int[] {1,0,2,0,3,0,4,0};
            System.out.println(Arrays.toString(moveZerosToTheEnd(numbers)));

        }

public static int [] moveZerosToTheEnd(int [] numbers){
           numbers = new int[] {1,0,2,0,3,0,4,0};

            int index = 0;

            for (int i = 0; i < numbers.length; i++) {

                if (numbers[i] != 0) {

                    numbers[index++] = numbers[i];//increments
                }
            }
            for (int i = index; i < numbers.length; i++) {

                numbers[i] = 0;

            }
            //System.out.println(Arrays.toString(numbers));

    return numbers;


        }

    }
