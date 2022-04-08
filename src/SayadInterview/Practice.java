package SayadInterview;

public class Practice {

    public static void main(String[] args) {
       int [] arr = new int [] {-1, -2, 6, -3};
       /*
You are given an array [-23, 12, -35, 45, 20, 36] then the two elements would be -35 & 36 as their pair sum is 1 which is closest to 0. You can generate all the pair sums and validate yourself.
        */
       int firstElement = arr[0];
       int secondElement = arr[1];
        int closestZeroSum = firstElement + secondElement;
        int sum = firstElement + secondElement;
        for(int i=0;i<arr.length;i++){
            for(int j=i + 1;j<arr.length;j++){
                sum = arr[i] + arr[j];
                if(Math.abs(sum)<=Math.abs(closestZeroSum)){
                    closestZeroSum = sum;
                    firstElement=arr[i];
                    secondElement=arr[j];
                }
            }
        }
        System.out.println("Closest to Zero Pair is ("+firstElement+","+secondElement+")");
    }
}
