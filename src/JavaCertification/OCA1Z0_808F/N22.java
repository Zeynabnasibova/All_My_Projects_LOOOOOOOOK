package JavaCertification.OCA1Z0_808F;

public class N22 {

    public static void main(String[] args) {

        int ans;
        try{
            int num = 10;
            int div = 0;
            ans = num / div;
        }catch (ArithmeticException ae){
            ans = 0;
            //System.out.println("Answer = " + ans);
        }catch (Exception e){
            System.out.println("Invalid calculation");
        }
        //System.out.println(ans);
    }
}
