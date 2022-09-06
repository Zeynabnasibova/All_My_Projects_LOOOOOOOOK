package codingPractice.codingBatRepeat.String1;

public class TwoChar {

    public static void main(String[] args) {

        TwoChar obj = new TwoChar();
        String str = "java";
        int index = 0;

        System.out.println(obj.twoChar(str, index));


    }

    public String twoChar(String str, int index) {

        if (index >= str.length() - 1 || index < 0) {

            return str.substring(0, 2);

        } else {

            return str.substring(index, index + 2);

        }
    }
}