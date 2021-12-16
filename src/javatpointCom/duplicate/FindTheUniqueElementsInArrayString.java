package javatpointCom.duplicate;

public class FindTheUniqueElementsInArrayString {
    /**
    Find unique elements in array Java
     */
    public static void main(String[] args) {

String [] arr = new String [] {"A","A","A","B","B","B","C","C","C","D","E","F"};

        String unique = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                unique += arr[i];
            }
        }
        System.out.println(unique);
    }

}
