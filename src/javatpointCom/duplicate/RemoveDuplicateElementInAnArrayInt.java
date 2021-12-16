package javatpointCom.duplicate;

public class RemoveDuplicateElementInAnArrayInt {
    /**
     * Java Program to remove duplicate element in an int Array
     */


    public static void main(String[] args) {

        int [] arr = new int [] {1, 2, 3, 3, 2, 3, 8, 8, 3};

        String nonduplicate = "";

        for (int i = 0; i < arr.length; i++) {

            if (!nonduplicate.contains("" + arr[i])) {

                nonduplicate += arr[i] + " ";
            }
        }
        System.out.println(nonduplicate);
    }


}
