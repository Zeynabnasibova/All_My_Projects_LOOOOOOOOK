package JavaCertification.OCA1Z0_808F;
import java.util.Scanner;
 class Bird{
public void fly(){
    System.out.println("Fly");
}
}


class Peacock extends  Bird{
     public void dance(){
         System.out.println("Dance");
     }
}
public class N177 {
    public static void main(String[] args) {


        Peacock obj1 = new Peacock();//Fly Dance
        obj1.fly();
        obj1.dance();

        Bird obj2 = new Peacock();
        obj2.fly();
        
        Scanner input = new Scanner(System.in);
        char ch = input.next().charAt(0);
        System.out.println(ch);

        int num1 = 2;
        char num2 = 'A';

        System.out.println(num1 > num2);
    }
}