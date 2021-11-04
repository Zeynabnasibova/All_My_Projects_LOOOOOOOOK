package replit.methodsWithReturn;
import java.util.Scanner;
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
        Scanner input = new Scanner(System.in);
        int size  = input.nextInt();
        String [] str1 = new String [size];
        for(int i = 0; i < str1.length; i++){
            str1[i] = input.nextLine();
        }

        String str = input.nextLine();
        System.out.println(count(str1,str));
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
