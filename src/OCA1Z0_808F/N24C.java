package OCA1Z0_808F;

class A1 {
    public A1() {
        System.out.print("A1");
    }
}
    class B1 extends A1{
        public B1(){
            System.out.print("B1");
        }
    }

public class N24C extends B1  {
    public N24C(){
        System.out.print("C");
    }

    public static void main(String[] args) {
        N24C obj1 = new N24C();//ABC

        System.out.println();

        B1 obj2 = new B1();//AB

        System.out.println();

        A1 obj3 = new A1();//A

        System.out.println();

      A1 obj4 = new B1();//AB

        System.out.println();

        B1 obj5 = new N24C();//ABC
    }

}
