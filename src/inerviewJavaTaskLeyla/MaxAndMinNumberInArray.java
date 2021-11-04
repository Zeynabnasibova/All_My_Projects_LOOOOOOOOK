package inerviewJavaTaskLeyla;

public class MaxAndMinNumberInArray {

    public static void main(String[] args) {


        int[] numArr = new int[]{1, 2, 3, 4, 5, 6};


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numArr.length; i++) {

            if (numArr[i] > max) {

                max = numArr[i];

            }
        }
        System.out.println("Max number = " + max);

        for (int i = 0; i < numArr.length; i++) {


      if(numArr[i] < min){

            min = numArr[i];

        }

        }
        System.out.println("Min number = " + min);

    }
}