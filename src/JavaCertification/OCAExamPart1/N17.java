package JavaCertification.OCAExamPart1;

public class N17 {

    public static void main(String[] args) {

        int x = 100;//101  102 103
        int a = x++;
//        System.out.println(a);// 100
//        System.out.println(x);//101

        int b = ++x;
//        System.out.println(b);//102
//        System.out.println(x);//102

        int c = x++;
//        System.out.println(c);//102
//        System.out.println(x);

        int d = (a < b) ? (a < c) ? a : (b < c) ? b : c : a;//true  true a =100

        System.out.println(d);


    }
}
