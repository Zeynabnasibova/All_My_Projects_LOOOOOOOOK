package practice2;

public class ArrayFindMaximum2 {

    public static int max(int [] num){

        int max = Integer.MIN_VALUE;

        for(int i = 0; i < num.length; i ++){

            if(num[i] > max){

                max = num[i];
            }
        }
        return max;
    }
    public static void main(String [] args){
        int [] num = new int [] {1,3, 4, 5, 6};
        System.out.println(max(num));
    }
}
