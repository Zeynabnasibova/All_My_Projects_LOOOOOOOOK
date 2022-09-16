package codingPractice.replit_.methodsWithReturn;

public class CountAppearance {

    public static int count(String[] str1, String str) {

        int count = 0;

        for (int i = 0; i < str1.length; i++) {

            if(str1[i].equals(str)){

                count++;
            }

        }
        return count;
    }

    public static void main(String [] args){
        String [] strArr = {"a","foo","bar","foo","bla"};
        String str = "foo";
        System.out.println(count(strArr,str));

    }


}
/*
Create a method that has two parameters of an array of strings and a string and should returns an int.

It counts how many times the given string appears in the array and returns the count.

for example (pseudo code):

array = ["a","foo","bar","foo","bla"]
string = "foo"

countAppearanc
 */
