package interviewAll;

public class RemoveDuplicateElementInAnArrayString {
    /**
     * Java Program to remove duplicate element in a String Array
     */

    public static void main(String[] args) {
      String [] str = new String [] {"A","B","B","B"};


        String nonduplicate = "";

        for (int i = 0; i < str.length; i++) {

            if (!nonduplicate.contains("" + str[i])) {

                nonduplicate += str[i] + " ";
            }
        }
        System.out.println(nonduplicate);
    }


}
