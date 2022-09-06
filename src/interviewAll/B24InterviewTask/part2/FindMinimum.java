package interviewAll.B24InterviewTask.part2;

public class FindMinimum {
    /*
    Q10:Array -- Find Minimum: Write a method that can find the maximum number from an int Array.

     */

    public static void main(String[] args) {

        int [] numArr = new int [] {1, 2, 3, 4, 5};//array declration

        System.out.println(min(numArr));//call my method

    }

    public static int min(int [] numArr){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int eachNum : numArr){//take one element of the array list

            if(eachNum < min){//then chek this elemen les than min

                min = eachNum;//if this number is less then min = this element
            }

        }
        return min;
    }


}
