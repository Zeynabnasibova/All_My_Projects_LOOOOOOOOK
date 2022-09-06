package interviewAll.B24InterviewTask.part4;

import java.util.Arrays;

public class ConcatenateTwoARraysWithoutUsingArrayCoppy {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        System.out.println(Arrays.toString(conCat(array1, array2)));

    }

  public static int [] conCat(int [] array1, int [] array2){

        int length = array1.length + array2.length;///add the length of firstArray into secondArray


        //instead of using arraycopy, we manually copy each element of both arrays array1 and array2 to result.
//int [] result = new int [array1.length + array2.length];
        int[] result = new int[length];//in here I create a new array result of the length.
        int pos = 0;//assign the position
        for (int element : array1) {//I use the for-each loop to iterate through each element of array1 and store it in the result.
            result[pos] = element;

            pos++;//I increase the position pos by 1,
        }

        for (int element : array2) {// I do the same for array2 and store each element in result starting from the position after array1.

            result[pos] = element;

            pos++;
        }

 
        return result;
    }
}