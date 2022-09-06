package JavaCertification.oracleJavaCertification;

public class N1 {

    public static void main(String[] args) {

        int x = 1;// 2

        int y = 1; // 2

        if(x++ < ++y){  // x = 1   y = 2
         // 1 < 2
            System.out.println("Hello ");
        } else {
            System.out.println("Welcome ");
        }
        System.out.println("Log " + x + ":" + y);

    }

}

/*
otput:   A
       Hello
       Log 2:2

 */