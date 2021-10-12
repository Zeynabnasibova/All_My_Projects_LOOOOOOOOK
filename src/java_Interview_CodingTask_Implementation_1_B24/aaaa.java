package java_Interview_CodingTask_Implementation_1_B24;

public class aaaa {

    /*   Array -- Sort Ascending
        Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Solution 1:*/

        public static void main(String[] args) {

//creating an instance of an array

            int[] arr = new int[] {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

            System.out.println("Array elements after sorting:");
//sorting logic
            for (int i = 0; i < arr.length; i++) {// 78  // outor

                for (int j = i + 1; j < arr.length; j++) { // 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65  // iner

                    int tmp = 0;

                    if (arr[i] > arr[j]){  //  78 > 34

                        tmp = arr[i];

                        arr[i] = arr[j];

                        arr[j] = tmp;
                    }
                }
//prints the sorted element of the array
                System.out.print(arr[i] + " ");
            }
        }
}