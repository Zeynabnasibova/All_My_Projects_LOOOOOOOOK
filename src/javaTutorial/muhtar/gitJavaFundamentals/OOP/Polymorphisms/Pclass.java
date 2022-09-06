package javaTutorial.muhtar.gitJavaFundamentals.OOP.Polymorphisms;

class Aclass{
    public void method1() {    System.out.println("Yashar");   }
    public void mm1() { System.out.println("hello"); };

    public void xx1(int a) {  System.out.println(a);   }
    public void xx1(int a, int b) {   System.out.println(a+" "+b);  }

}


class Bclass extends Aclass{
    public void method1() {  System.out.println("Shehla");  }
    public void mm2() { System.out.println("Hola");  }

    public void xx1(int a, double c) { }


}
class Cclass extends Bclass{

    public void method1() {  System.out.println("Erpan");  }
    public void mm3() { System.out.println("Niho"); }

}

public class Pclass {

    public static void main(String[] args) {
        Aclass obj1 =new Aclass();
        obj1.method1();   // yashar

        Aclass obj2=new Bclass();
        obj2.method1();  // shehla:   if method is exist in both parent and child class, the override one will return.

        Aclass obj3=new Cclass();
        obj3.method1();  // erpan
        obj3.mm1();	    // hello
        //	  obj3.mm3();	 //reference type decides what methods and variables can be called and cannot be called.
        // in order to call the method, it has to exist in reference class.

        Bclass obj4=new Bclass();
        // obj4.mm1();

        Bclass obj5=new Cclass();

    }

}