package codingPractice.codingBatRepeat.Warmup2;

public class DoubleXIndexOfMethod {

    /*
    Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

     */
public static void main(String [] args){

    DoubleXIndexOfMethod obj = new DoubleXIndexOfMethod();

    System.out.println(obj.doubleX("axxxbb"));

}



    boolean doubleX(String str) {

        int i = str.indexOf("x");

        if(i == -1) {
            return false;
        }else if(i + 1 >=str.length()) {
            return false;

        }else if(str.substring(i+1, i+2).equals("x")){//1 + 1 =2  //1 + 3 =4

            return true;

        }else {

            return false;
        }


}

}
