package muhtar.gitJavaFundamentals.Blocks_Constrctor.Blocks;

	/*
		  	static block:
		  		0. cannot be created inside any methods.
		  		1. first to execute and executes one time only!
		  		2. can initialize static instance variables.

		  	Instance block:
		  		only executed when the class object is created.
		  		executes as much as the numbers of the created objects.


		 */

class blocks{

    static {
        System.out.println("Hello");
    }

    {
        System.out.println("Hola");
    }

}


public class InstanceBlock extends blocks {

    public static void main(String[] args) {
        blocks obj1=new blocks();
        blocks obj2=new blocks();
        blocks obj3=new blocks();
        blocks obj4=new blocks();

    }
}

class C extends InstanceBlock{
    public static void main(String[] args) {
       C obj=new C();


    }
}

