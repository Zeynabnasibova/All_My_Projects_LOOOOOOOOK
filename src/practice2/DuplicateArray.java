package practice2;

public class DuplicateArray {
    /*
    Find total number of pairs in ArrayList
Array has 10 elements, find duplicates
     */


    public static String duplicate(String [] arr){

        String duplicate = "";

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for(int j = 0; j < arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count > 1){
                duplicate += arr[i];
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
String [] arr = new String [] {"A", "A", "B","B", "C","D","D","D","L","M"};

        System.out.println(duplicate(arr));
    }

}
