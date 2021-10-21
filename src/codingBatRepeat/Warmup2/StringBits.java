package codingBatRepeat.Warmup2;

public class StringBits {

    /*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"

     */
    public static void main(String[] args) {

        StringBits obj = new StringBits();

        System.out.println(obj.stringBits("Hello"));
    }



    public String stringBits(String str) {


        String newStr = "";
//// Note: the loop increments i by 2
        for (int i = 0; i < str.length(); i += 2) {

            newStr = newStr + str.substring(i,i+1);


        }
        return newStr;
    }

}
