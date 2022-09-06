package JavaCertification.oracleJavaCertification.cherchertech.N1;

public class N1 {
    public static void main(String[] args) {
        final String fName = "James";
        String lName = "Gosling";
        String name1 = fName + lName;
        String name2 = fName + "Gosling";
        String name3 = "James" + "Gosling";
//        String s = new String("Gosling");
//        s = lName;
        //String s1 = new String("Gosling");

        //System.out.println(s==s1);
     //   System.out.println(s==lName);
        System.out.println(name1 == name2);
        System.out.println(name2 == name3);
    }

}
