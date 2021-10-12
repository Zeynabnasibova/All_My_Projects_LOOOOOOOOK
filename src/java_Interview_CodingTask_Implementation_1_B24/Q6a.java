package java_Interview_CodingTask_Implementation_1_B24;

import java.util.Arrays;

public class Q6a {

    /*
    Q6: String -- Sort Letters and Numbers from alphanumeric String:
     Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
      sort the individual string and append them back together
       Ex:
        Input: "DC501GCCCA098911"
        OutPut: "CD015ACCCG011899"
     */

//

    public static void main(String[] args) {

        String str = "DC501GCCCA098911";

        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            str2 += "" + str.charAt(i);
            if (Character.isAlphabetic(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isDigit(str.charAt(i + 1))) {
                    str2 += ",";
                    //System.out.println(str2);
                }
            }

            if (Character.isDigit(str.charAt(i)) && i < str.length() - 1) {
                if (Character.isAlphabetic(str.charAt(i + 1))) {
                    str2 += ",";
                    System.out.println(str2);
                }
            }
        }
        String[] arr = str2.split(",");
        str = "";
        for (String each : arr) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            for (char eachChar : chars) {
                str += "" + eachChar;
            }
        }
        System.out.println(str);
    }
}