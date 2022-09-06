package javaTutorial.muhtar.gitJavaFundamentals.OOP.Abstraction;

public abstract class Class1 {
    public Class1(){
        System.out.println("Hello");
    }

    //  Class1 obj=new Class1();  abstract class cannot be object type.

    public  abstract void method();

    abstract public String method2();

//	abstract public int method3() {};   abstract method can't have body.

//	abstract static public void method5();  // abstract method cannot be either static or final

//	abstract private void mm();			// abstract methods cannot be private.

    // override method has to happen in multiple class.
    // overloading can exist in a single class
    public void method7(int a) {

    }
    public void method7(int a, int b) {

    }

}
