package codingPractice.codingBatRepeat.Warmup1;

public class BackAround {
    /*

Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
     */
    public static void main(String[] args) {

        BackAround obj = new BackAround();

        System.out.println(obj.backAround("cat"));
    }


    public String backAround(String str) {

        String newStr = str.substring(str.length()-1) +  str.substring(0) + str.substring(str.length()-1);
        return newStr;
    }

}
