package muhtar.gitJavaFundamentals;


class l{

    public static void method1(double a) {
        System.out.println("From parent class");
    }

    public void method2() {
        System.out.println("Parent override");
    }

}
public class overload extends l{

    public static void method1(int a) {
        System.out.println("From child class");
    }
    public void method2() {
        System.out.println("Child override");
    }
    public static void method1(String str) {
        System.out.println("hola");
    }
    public static void main(String[] args) {
        l obj=new overload();
        obj.method2();  // child class one will return
        obj.method1(9);		// parent class' one will return
        //	 obj.method1( "x" );   reference class decides what methods can be called


    }

}