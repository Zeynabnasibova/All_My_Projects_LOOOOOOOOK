package codingBatRepeat.Warmup1;

public class NotString {

    public static void main(String[] args) {

        NotString obj = new NotString();

        String str = "not do";


        System.out.println(obj.notString(str));
    }


    public String notString(String str) {

        if(!str.startsWith("not")){

            str = "not " + str;
            return str;

        }else {

            return str;
        }
    }


}
