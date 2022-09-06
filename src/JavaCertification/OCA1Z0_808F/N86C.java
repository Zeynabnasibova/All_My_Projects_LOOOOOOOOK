package JavaCertification.OCA1Z0_808F;



class A{

    public void test(){
        System.out.println("A");
    }
}
class B extends A{
    public void test(){
        System.out.println("B");
    }
}



public class N86C extends A{

    public void test(){
        System.out.println("C");
    }
    public static void main(String[] args) {
        A b1 = new A();
        A b2 = new N86C();
    //    A b3 = (B) b2;
        A b3 = new B();

       // b1 = (A) b2;
        b1.test();
        b3.test();
    }
}
