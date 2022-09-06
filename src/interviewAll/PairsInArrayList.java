package interviewAll;

public class PairsInArrayList {

    /**
     * Find total number of pairs in ArrayList?
     */

    public static void main(String[] args) {
        int[] a = {8, 7, 2, 5, 3};
        int b = 10; //
        findPair(a, b);
    }

    // method to find a pair in an array with a given sum
    public static void findPair(int[] a, int b) {
        // consider each element except the last
        for (int i = 0; i < a.length; i++) {

            // start from the i with element until the last element
            for (int j = i + 1; j < a.length; j++) {

                // if the desired sum is found, print it
                if (a[i] + a[j] == b) {
                    System.out.println("Pair found (" + a[i] + "," + a[j] + ")");
                }

            }
        }
    }
}