package java_Interview_CodingTask_Implementation_1_B24;

public class Q10 {
    /*
    Q10:Array -- Find Minimum: Write a method that can find the maximum number from an int Array.

     */

    public static void main(String[] args) {

        int [] numArr = new int [] {1, 2, 3, 4, 5};

        System.out.println(min(numArr));

    }

    public static int min(int [] numArr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int eachNum : numArr){

            if(eachNum < min){

                min = eachNum;
            }

        }
        return min;
    }


}
