package interviewAll;

public class FindTheUniqueElementsInArrayInt_ {
    /**
     Find unique elements in array Java
     */
    public static void main(String[] args) {

       int [] arr = new int [] {1, 2, 3, 4, 5, 6, 7, 7,1};


        String unique = "";
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                unique += arr[i] + " ";
            }
        }
        System.out.println(unique);
    }

}