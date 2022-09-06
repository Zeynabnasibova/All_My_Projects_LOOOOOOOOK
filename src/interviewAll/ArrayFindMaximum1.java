package interviewAll;

public class ArrayFindMaximum1 {

        /*
Write a method that can find the maximum number from an int Array
 */

    public static int max(int [] arr){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
             max = arr[i];
            }
        }
        return max;
    }
    public static void main (String [] args){
        int [] arr = new int []{1,2,3};
        System.out.println(max(arr));
ArrayFindMaximum1 obj = new ArrayFindMaximum1();
        System.out.println(obj.mAX(arr));
    }
    public int mAX(int []arr){
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
