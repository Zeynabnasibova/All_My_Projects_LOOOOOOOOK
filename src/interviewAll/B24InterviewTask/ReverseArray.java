package interviewAll.B24InterviewTask;

public class ReverseArray {

    /*
    1. Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
 int[] arr = {10, 9, 8, 7};
  Sort(arr);==>{ 7, 8, 9, 10};


     */
    public static void main(String[] args) {

        int [] number = new int [] {10, 9, 8, 7};

        for(int i = number.length -1;i >= 0;i--){


           int reverse = number[i];

            System.out.print(reverse + " ");

          //  int [] numArr = new int [reverse];

           // System.out.println(Arrays.toString(numArr));
        }


    }
}
