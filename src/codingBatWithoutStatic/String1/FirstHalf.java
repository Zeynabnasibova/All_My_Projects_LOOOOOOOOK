package codingBatWithoutStatic.String1;

public class FirstHalf {



    public static void main(String[] args) {


        FirstHalf obj = new FirstHalf();

        obj.firstHalf("WoooHoo");

        System.out.println(obj.firstHalf("WoooHoo"));



    }



    public String firstHalf(String str) {

        str = str.substring(0,str.length()/2);

        return  str;
    }

}

