package codingPractice.codingBatRepeat.Warmup2;

public class StringX {


    public static void main(String[] args) {


        StringX obj = new StringX();
        String str = "xHi";
        System.out.println(obj.stringX(str));

    }

    public String stringX(String str) {
        if(str.length() == 1 && str.charAt(0) == 'x')
            return str;
        String newStr = str;

        for (int i = 0; i < str.length(); i++) {

            if (str.substring(1, str.length() - 1).contains("x") && str.charAt(0) != 'x' && str.charAt(str.length() - 1) != 'x') {

                newStr = str.substring(i).replace("x", "");
                return newStr;
            }else if (str.substring(1, str.length() - 1).contains("x") && str.charAt(0) == 'x' && str.charAt(str.length() - 1) == 'x') {

                newStr = str.substring(i).replace("x", "");

                return "" + str.charAt(0) + newStr + str.charAt(str.length() - 1);


            }



        }

        return str;
    }
}