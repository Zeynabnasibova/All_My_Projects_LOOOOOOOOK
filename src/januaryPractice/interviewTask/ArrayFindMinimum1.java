package januaryPractice.interviewTask;

public class ArrayFindMinimum1 {

    public static int min(int [] arr){

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] < min){
                min = arr[i];
            }

        }
        return min;
    }
    public static void main(String [] args){
        int [] arr = new int []{1,2,3};
        System.out.println(min(arr));
    }
}
