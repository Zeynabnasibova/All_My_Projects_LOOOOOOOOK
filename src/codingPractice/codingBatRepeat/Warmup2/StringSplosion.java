package codingPractice.codingBatRepeat.Warmup2;

public class StringSplosion {

    public static void main(String[] args) {

        StringSplosion obj = new StringSplosion();
        String str = "Code";
        System.out.println(obj.stringSplosion(str));
    }

    public String stringSplosion(String str) {
        String newStr = "";
        //String newStr = str(0,1) + str(0,2) + str(0,3);
        for (int i = 0; i < str.length(); i++) {
            newStr += str.substring(0, i + 1);


        }
        return newStr;

    }
}