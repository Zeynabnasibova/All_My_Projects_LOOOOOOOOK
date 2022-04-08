package w3resource_com.BasicPart_1;

public class Ex80 {
    public static void main(String [] args){
        int [] arr = new int [] {20, 30, 40};
        int max = Integer.MIN_VALUE;
        if(arr[0] > arr[arr.length-1]){
            max = arr[0];
        }else{
            max = arr[arr.length-1];
        }
        System.out.println(max);
    }
}
