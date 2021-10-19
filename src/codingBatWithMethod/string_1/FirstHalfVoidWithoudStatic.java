package codingBatWithMethod.string_1;

public class FirstHalfVoidWithoudStatic {




    public void firstHalf(String str) {

        str = str.substring(0,str.length()/2);

        System.out.println(str);

    }


    public static void main(String[] args) {

        FirstHalfVoidWithoudStatic str = new FirstHalfVoidWithoudStatic();

        str.firstHalf("WooHoo");


    }
}
