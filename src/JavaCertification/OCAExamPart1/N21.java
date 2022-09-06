package JavaCertification.OCAExamPart1;

public class N21 {

    public static void main(String[] args) {

        String str1 = new String("Java");
        String str2 = "Java";
        String str3 = "Java";
        System.out.println(str1 == str2);//false
        System.out.println(str2 == str3);//true
        str1 = str2;
        System.out.println(str1 == str2);//true



    }
}
class N21a{
    public static void main(String[] args) {

        String str1 = "Java";
        String [] str4 = {"Java"};
        String [] str2 = {"J", "a", "v","a"};
        String str3 = "";

        for(int i = 0; i < str2.length;i++){
            str3 += str2[i];
        }
        System.out.println(str3);
        boolean b1 = str1 == str3;//false
        boolean b2 = str1.equals(str3);//true

        System.out.println(str1.equals(str4));

        System.out.println(b1 + ", " + b2);

    }
}
class N33{

    public static void main(String[] args) {

        String str1 = "Java";
        String [] str2 = {"J", "a", "v","a"};
        String str3 = "";

        for(int i = 0; i < str2.length;i++){
            str3 = str3 + str2[i];
        }
        System.out.println(str3);
        boolean b1 = str1 == str3;//false
        boolean b2 = str1.equals(str3);//true

        System.out.println(b1 + ", " + b2);

    }

}

class N33c{
    public static void main(String[] args) {

        String str1 = "Java";
        String[] str2 = {"J", "a", "v", "a"};
        String str3 = "";
        String [] str4 = {"J", "a", "v","a"};
        for(int i = 0; i < str2.length;i++){
            str3 += str2[i];
        }
        boolean b = str2 == str4;//false
        System.out.println(b);
        str2 = str4;
        boolean b1 = str2 == str4;//true
        System.out.println(b1);




    }
}


