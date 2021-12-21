package muhtar.gitJavaFundamentals.Blocks_Constrctor.Blocks;

public class StaticBlocks {
    		/*
		  	static block:
		  		0. cannot be created inside any methods.
		  		1. first to execute and executes one time only!
		  		2. can initialize static instance variables.

		  	Instance block:
		  		only executed when the class object is created.
		  		executes as much as the numbers of the created objects.
		 */

    public StaticBlocks() {
        System.out.println("hello");
    }

    static int a;
    static String b;
    static boolean c;
    static char d;

    static {
        new StaticBlocks();
        a=10; b="Today"; c=false; d='A';
        System.out.println("Hell Cybertek");

    }

    public static void main(String[] args) {
        System.out.println( a+" "+b+" "+c+" "+d );

        System.out.println("Hell World");

    }

}
