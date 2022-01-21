package codingBatRepeat.Warmup1;

public class Practice {

    public static void main(String[] args) {

        System.out.println(helloStatic());
        Practice obj = new Practice();
        obj.helloInstance();

    }

    public static boolean helloStatic(){

        //static String str = "I am fine";
           String str1 = "How are you";


        return false;
    }
    public void helloInstance(){
      // static  String str = "I am fine";
        String str1 = "How are you";
       // System.out.println(helloStatic());
//helloInstance();

        System.out.println(str1);
    }

}
