package canvasOCASertification;

public class N21 {

    public static void main(String[] args) {

//        String str1 = new String("Java");
//        String str2 = "Java";
//        str1 = str2;
//      //  String str3 = str1;
////
////        System.out.println(str1 == str3);//true
////        System.out.println(str1.equals(str3));//true
//
//        System.out.println(str1 == str2);//true

        String str1 = "Java";
        String [] str2 = {"J", "a", "v","a"};
        String str3 = "";

        for(int i = 0; i < str2.length;i++){
            str3 += str2[i];
        }
        System.out.println(str3);
        boolean b1 = str1 == str3;//false
        boolean b2 = str1.equals(str3);//true

        System.out.println(b1 + ", " + b2);

    }
}
