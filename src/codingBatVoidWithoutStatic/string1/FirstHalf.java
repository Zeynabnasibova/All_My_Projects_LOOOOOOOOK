package codingBatVoidWithoutStatic.string1;

public class FirstHalf {


    public static void main(String[] args) {

        FirstHalf obj = new FirstHalf();

        obj.firstHalf("WoooHoo");



    }



    public void firstHalf(String str) {

        str = str.substring(0,str.length()/2);

        System.out.println(str);
    }

}
