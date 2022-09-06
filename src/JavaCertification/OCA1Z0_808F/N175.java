package JavaCertification.OCA1Z0_808F;

public class N175 {

    int foo;
    static int bar;

    static void procees(){
     //   foo += 10;
       // bar += 10;
        System.out.println(bar += 10);
    }

    public static void main(String[] args) {
        N175 obj1 = new N175();

        N175 obj2 = new N175();
       // N175.procees();
        N175.procees();

    }
}
