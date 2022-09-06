package interviewAll.B24InterviewTask;

import java.util.Arrays;

public class SortLetters {

    /*
    Q6: String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"
     */
    public static void main(String[] args) {

        String str = "DC501GCCCA098911";
        // 1
        String str1 = str.substring(0,2);

        String [] str1Arr = str1.split("");

        Arrays.sort(str1Arr);

        String newstr1Arr = String.join("",str1Arr);//cd

        //System.out.println(newstr1Arr);
        // 2
        String str2 = str.substring(2,5);

        String [] str2Arr = str2.split("");

        Arrays.sort(str2Arr);

        String newstr2Arr = String.join("",str2Arr);//015
        // 3
        String str3 = str.substring(5,10);

        String [] str3Arr = str3.split("");

        Arrays.sort(str3Arr);

        String newstr3Arr = String.join("",str3Arr);
        // 4
        String str4 = str.substring(10,16);

        String [] str4Arr = str4.split("");

        Arrays.sort(str4Arr);

        String newstr4Arr = String.join("",str4Arr);

        System.out.println(newstr1Arr + newstr2Arr + newstr3Arr + newstr4Arr);





//        String[] strArr = str.split("");
//
//        System.out.println(Arrays.toString(strArr));
//
//        Arrays.sort(strArr);
//
//        System.out.println(Arrays.toString(strArr));

    }
}
