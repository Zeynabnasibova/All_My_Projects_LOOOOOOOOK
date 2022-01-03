package muhtar.gitJavaFundamentals.Exceptions;

public class Throws_VS_tryCatch {

    public static void main(String[] args) {


        //	method1();
        method2();
        //we didn't use try catch to completely handle the checked exception in method1,
//		method3();
        System.out.println("hello");

    }

    public static void method1() throws InterruptedException{

        Thread.sleep(1000);

    }

    public static void method2() {
        try {
            Thread.sleep(1000);
        } catch(Exception e) {}
    }

    public static void method3() {
        throw new RuntimeException();
    }


}
	/*
		Throws: we use it at method declerations, and onnly apply it to the cheked exception
				1. only can handle the cheked exception (not completly).

		try& catch: always handles any exceptions IMMIDIETLY and Completly.

		throw:  declared inside the method, used to created exception class' object.


	*/