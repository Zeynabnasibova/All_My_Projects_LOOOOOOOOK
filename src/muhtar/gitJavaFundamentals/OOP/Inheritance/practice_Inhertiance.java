package muhtar.gitJavaFundamentals.OOP.Inheritance;


class A1 {
    public static void method1() {
        System.out.println("Yashar");
    }
}

class A2 extends A1{      // there are tow methods: method1 and method2
    public static void method2() {
        System.out.println("Shehla");
    }
}

class A3 extends A2{       // there are three methods: method1,2,3.
    public static void method3() {
        System.out.println("Erpan");
    }
}

class A4 extends A3{   // there are four methods: method1, method2, method3, method4.
    public static void method4() {
        System.out.println("Tumaris");
    }
}

public class practice_Inhertiance extends A4 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();

        practice_Inhertiance obj=new practice_Inhertiance();

        A1 obj1=new A1();
        A1 obj2=new A2();
        A1 obj3=new A3();
        A1 obj4=new A4();
        A1 obj5=new practice_Inhertiance();

        //	A2 newOBJ1 = new A1();  if child is reference type, then we cannot give the parent as an object type.





    }

    class A8{

    }

    class B8 extends A8{
        A8 obj=new B8();
// 		B8 obj2=new C8();    // B8 and C8 are not in a relation, they have relation bot not IS in .

    }
    class C8 extends A8 {
        A8 obj=new C8();
    }





}