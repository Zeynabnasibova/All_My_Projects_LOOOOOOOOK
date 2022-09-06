package javaTutorial.muhtar.gitJavaFundamentals.OOP.finalKeyWord;

class t{
    final public void method1() {
        System.out.println("Hello");
    }

    public static void mm() {
        System.out.println("day1");
    }
}

public class InMethods extends t{
//	public void method1() {	System.out.println("xxxx"); }   final methods cannot be override

    public static void mm() {
        System.out.println("ooo");
    }

    public static void main(String[] args) {
        t obj=new InMethods();
        obj.mm();  // static method cannot be override. that's why return the parent mm();

    }

}
	/* if a method is final:
						1. we cannot override (satatic methods cannot be override either).
						2. abstract methods cannot be final.
		*/
