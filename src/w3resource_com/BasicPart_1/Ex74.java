package w3resource_com.BasicPart_1;

public class Ex74 {
    /*
  74. Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.
Sample Output:
Test Data: array = 10, -20, 0, 30, 40, 60, 10
true
     */
    public static void main(String[] args) {
        int [] arr = new int [] { -20, 0, 30, 40, 60};
        if(arr.length >= 2 && arr[0]==10 || arr[arr.length-1]==10){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}
