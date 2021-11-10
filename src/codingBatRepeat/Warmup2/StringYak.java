package codingBatRepeat.Warmup2;

public class StringYak {

    public static void main (String [] args){


        StringYak obj = new StringYak();
        String str = "yakpak";
        System.out.println(obj.stringYak(str));

    }

    public String stringYak(String str){

            String newStr =str.replace("yak","");
            return newStr;

    }

}
