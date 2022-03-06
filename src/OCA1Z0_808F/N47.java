package OCA1Z0_808F;



class CC1{

    public CC1(){
        System.out.println("CC1");
    }
}
class CC2 extends CC1{
    public CC2(){
        System.out.println("CC2");
    }

}

class  CC3 extends CC2{
public CC3(){
    System.out.println("CC3");
}
}
public class N47 {
    public static void main(String[] args) {

        CC1 obj1 = (CC1)new CC2();
        System.out.println();
        CC2 obj2 =(CC2) new CC3();
        System.out.println();
       // CC2 obj3 = (CC2) new CC1();
        CC3 obj4 = (CC3) obj2;


    }

}