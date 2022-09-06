package javaTutorial.muhtar.gitJavaFundamentals.Exceptions;

public class tryCatch {

    public static void main(String[] args) {

// unchecked:
        try {

            int z=2/0;
            System.out.println(z);
            // if the exception is uncheked, try block is not executed.
            System.out.println("try block executed in this uncheked exceptiond");

        } catch(ArithmeticException e) {
            System.out.println("Uncheked Exception found");
        }
        // if the caught exception is unchecked, then the catch block will be executed.


// checked:
        try {

            Thread.sleep(2000);
            // try block is excuted when the exception is checked
            System.out.println("try block executed in this cheked exceptiond");

        } catch (InterruptedException e) {
            System.out.println("Chekced exception found");
        }
        // if the caught exception is chekced, catch block won't be excuted.


        System.out.println("Hello");

        try {
            System.out.println("Hellow WOrld");
        } catch(Exception e) {
            System.out.println("ee");
        }finally {
            System.out.println("finally block");
        }

        System.out.println("=====================");


        // catch( exceptionclassname  variablename)

        try {

            int p=2/0;
            System.out.println(p);

        } catch(IndexOutOfBoundsException yashar) {
            System.out.println("Yashar");
        } catch (ArithmeticException alim) {
            System.out.println("Irpan");
        }catch (RuntimeException e) {
            System.out.println("Shehla");
        }catch (Exception e) {
            System.out.println("Kuddus");
        }finally {
            System.out.println("Tumaris");
        }




    }

}
	/* conlcution:   try block will be executed when exception is checked
					 catch block is only executed when exception is uncheked.
					 finally block will be executed regardless if there is any exception or not.
	*/