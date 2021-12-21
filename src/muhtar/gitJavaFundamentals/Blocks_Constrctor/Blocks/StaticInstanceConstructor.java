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
class ALL{

    static int a=20;

    ALL(){
        System.out.println("Constrcutor");
    }

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

}


public class StaticInstanceConstructor extends ALL{
    public static void main(String[] args) {

        System.out.println(a);

        ALL obj1=new ALL();   // static, initializer, constructor
        ALL obj2=new ALL();   // initializer, constructor
        ALL obj3=new ALL();		// initializer, constructor

        // first static blocks, then instance the constructor.

    }

}