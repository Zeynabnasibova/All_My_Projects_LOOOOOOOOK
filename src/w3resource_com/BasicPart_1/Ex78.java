package w3resource_com.BasicPart_1;

public class Ex78 {
    public static void main(String [] args){
        int [] arr = new int [] {5,7};
        for(int i = 0; i < arr.length; i++){
            if(arr[i] ==4 || arr[i] == 7){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
}
