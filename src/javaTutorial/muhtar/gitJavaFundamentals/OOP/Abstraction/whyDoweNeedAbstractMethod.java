package javaTutorial.muhtar.gitJavaFundamentals.OOP.Abstraction;

interface APPLE{

    abstract public void calculateprice();  // abstract method meant to be override.
    abstract public void hhh();


}


class A implements APPLE{

    public void policy1() {

    }

    @Override
    public void calculateprice() {
        System.out.println("Canda: ");

    }

    @Override
    public void hhh() {
        // TODO Auto-generated method stub

    }

}
class B implements APPLE{
    public void policy2() {

    }

    @Override
    public void calculateprice() {
        System.out.println("America: 800");

    }

    @Override
    public void hhh() {
        // TODO Auto-generated method stub

    }

}
class C implements APPLE{

    @Override
    public void calculateprice() {
        System.out.println();

    }

    @Override
    public void hhh() {
        // TODO Auto-generated method stub

    }

}
class D implements APPLE {

    @Override
    public void calculateprice() {


    }

    @Override
    public void hhh() {


    }

}

public class whyDoweNeedAbstractMethod {

    public static void main(String[] args) {
        APPLE obj=new B();
        obj.calculateprice();

/*
 		in java:
		!true is false, false is !true,  true is !false and false is !true,
				that's why true != false and false !=true.
				therfore true == true and false == false
															-- Yahsar!
 */





    }

}