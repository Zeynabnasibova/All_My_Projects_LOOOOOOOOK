package beknazarsuranchiyev;

public class FindSecondMinMaxNumber {

    /**
     * 7. Find the second min/max number from an array. Write a method that will accept int array as an argument and return second or n min/max number from the given array. I will go with the sorting algorithm. Arrays.sort() is using mergesort and it’s the time complexity is logarithmic (n log n). Some interviewers don’t like it when sorting is used. It’s possible to do without sorting, using nested loops and we will end up having O(n²).
     */
    public static void main(String[] args) {

        int[] arr = {12, 5, 67, 2, 88, 98};

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
           // for (int j = 1; j < arr.length; j++) {
            for (int j = i + 1; j < arr.length; j++) {

                if ( arr[i] < min ) {

                    min = arr[i];

                    if (arr[j] < secondMin && arr[j] != min) {

                        secondMin = arr[j];
                    }
                }
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Second Minimum number: " + secondMin);
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }
        }
        for (int j = 0; j < arr.length; j++) {

            if (arr[j] > secondMax  && arr[j] != max ) {

                secondMax = arr[j];
            }

        }



        System.out.println ( "Max number: " + max );
        System.out.println ( "Second max number " + secondMax );

    }


    }