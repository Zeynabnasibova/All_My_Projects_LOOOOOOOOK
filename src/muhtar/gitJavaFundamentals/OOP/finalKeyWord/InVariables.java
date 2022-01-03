package muhtar.gitJavaFundamentals.OOP.finalKeyWord;


class pp{
    static int uu;
}

public class InVariables {
    int num2;
    //	 final int num3;    // if instance variables are final, they must be initilized.
    static int numS;
    public static void main(String[] args) {
        InVariables obj=new InVariables();
        obj.num2=40;
        obj.numS=50;

        InVariables obj2=new InVariables();
        obj2.num2=100;
        obj2.numS=200;

        System.out.println( obj.numS + " " + obj2.numS);




        System.out.println(pp.uu);



        System.out.println(obj.num2);
        // regular instance variables i can use it without initilizing



        int num;
//System.out.println(num);  // local variables must be initialized before it's used.

        // final variables: once it's initialized, cannot be changed.

        // static: 1. accepts static directly. in order to call none static in a static we need to create the object.
        //			2. static can keep the latest updates, regardless of the differences of objects



    }

}