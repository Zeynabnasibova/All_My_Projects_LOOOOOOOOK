package javaTutorial.refreshjavaCom.String;

public class STRIMGMethods {

    public static void main(String[] args) {


        String strTest = "refresh java";
        int strIndex = strTest.indexOf("java",6);
        System.out.println(strIndex);

        System.out.println(strTest.indexOf("java",9));
        System.out.println(strTest.lastIndexOf("java"));
        System.out.println(strTest.lastIndexOf("v"));
        System.out.println(strTest.charAt(8));


    }
}
