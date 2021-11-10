package replit.array1;

import java.util.Arrays;

public class MergeStrinArray {

        public static void main(String[] args) {
            String[] str1=new String[]{"java","is","good"};
            String[] str2=new String[]{"programming","language"};
            System.out.println(Arrays.toString(mergR(str1,str2)));

            //you can all use toString method to convert both arrays to string and concatenate as string and split back to array
            System.out.println(Arrays.toString(mergeWithToString(str1,str2)));


        }
        public static String[] mergR(String[] str1, String[] str2){
            //create a new array with total size of both arrays
            String[] mergedArray=new String[str1.length+ str2.length];
            //add first array to new array
            for (int i = 0; i < str1.length; i++) {
                mergedArray[i]=str1[i];
            }
            //get length of first array which will be the position where we will add 2nd array in new array
            int position= str1.length;
            for (int i = 0; i < str2.length; i++) {
                mergedArray[position]=str2[i];
                position++;
            }
            return mergedArray;
        }
        public static String[] mergeWithToString(String[] str1, String[] str2){
            //covert arrays to string concatenate them with a , and space between, and replace [] from the string, and split them back to array with , again.
            return (Arrays.toString(str1)+", "+Arrays.toString(str2)).replaceAll("\\[","").replaceAll("]","").split(", ");
        }

    }