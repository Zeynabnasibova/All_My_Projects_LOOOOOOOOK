package practiceAllInterviewCodingTasksSaim;

public class ArrayPermutationCombination {
    /*
Given an array of 3 characters print all permutation combinations from the given characters
 */

    //third I create a static method getPermutations(), and inside this method, I call the helper() method
    public static void getPermutations(int[] array){

        helper(array, 0);
    }
    //second I create a static method helper(),and inside the helper method I
    private static void helper(int[] array, int posssition){
//1. I first check the position to ensure whether the position indicates the last element or not.If the position indicates the last element, then there will be nothing to permute. In this case, we print all the array elements and pass the control to the main() method.
        if(posssition >= array.length - 1){

            System.out.print("[");

            for(int i = 0; i < array.length - 1; i++){

                System.out.print(array[i] + ", ");

            }if(array.length > 0)

                System.out.print(array[array.length - 1]);

            System.out.println("]");

            // return;
        }
//If the position doesn't indicate the last element of the array,
        for(int i = posssition; i < array.length; i++){

            int eachNUmber = array[posssition];
//I swap the indices position elements and i.
            array[posssition] = array[i];

            array[i] = eachNUmber;

            helper(array, posssition+1);

            eachNUmber = array[posssition];

            array[posssition] = array[i];

            array[i] = eachNUmber;

        }

    }
    public static void main(String args[]) {
        int[] numbers = {1, 9, 4};

        getPermutations(numbers);
        /*[9, 1, 4]
            [9, 4, 1]
            [9, 4, 1]
            [4, 9, 1]
            [4, 9, 1]
           [4, 1, 9]
           [4, 1, 9]

         */

    }
}
