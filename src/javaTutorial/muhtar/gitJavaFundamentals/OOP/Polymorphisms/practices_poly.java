package javaTutorial.muhtar.gitJavaFundamentals.OOP.Polymorphisms;

class kk1{
    public void addnum(int a) {  System.out.println(10+a);  }

    public void addnum(int b, double c) {   System.out.println(b-c);   }


}
class jj1 extends kk1{

    public void addnum(int b) {  System.out.println(20+b);  }

}
class LL1 extends jj1{
    public void addnum(int x, short t) {System.out.println(x*t);};

    public void addnum(int y) { System.out.println(y*2);  }

}

// if a method is exist in both reference and child(if it's override), always override one will return.


public class practices_poly {

    public static void main(String[] args) {

        kk1 obj =new LL1();
        obj.addnum(10,20);

//		jj1 obj=new jj1();   // jj1 has two methods
//
//		LL1 obj2=new LL1();   // LL1 has three methods.


        add(10,15);


    }
    public static void add(int a, int b) {
        System.out.println("int version");
    }
    public static void add(double a, double b) {
        System.out.println("double version");
    }
    public static void add(Integer a, Integer b) {
        System.out.println("Integer version version");
    }
    public static void add(Double a, Double b) {
        System.out.println("Double Version");
    }





}