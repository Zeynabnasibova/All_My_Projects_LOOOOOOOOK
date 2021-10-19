package B24InterviewTask.Part2;

public class ArrayFinfMaximum {

/*
Q9:Array -- Find Maximum:  Write a method that can find the maximum number from an int Array.
 */

    public static void main(String[] args) {

        int [] numArr = new int [] {1, 2, 3, 4, 5};

        System.out.println(max(numArr));
    }

    public static int max(int [] numArr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int eachNum : numArr){

            if(eachNum > max){

                max = eachNum;
            }

        }
        return  max;
    }

}
