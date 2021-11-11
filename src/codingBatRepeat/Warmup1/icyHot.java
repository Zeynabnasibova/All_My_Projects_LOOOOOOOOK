package codingBatRepeat.Warmup1;

public class icyHot {

    public static void main(String[] args) {

        icyHot obj = new icyHot();
        int temp1 = 8;
        int temp2 = 87;
        System.out.println(obj.icyHot(temp1,temp2));

    }

    public boolean icyHot(int temp1, int temp2) {


        if(temp1 < 0 && temp2 > 100 || temp2 < 0 && temp1 > 100 ){

            return true;

        }else{
            return false;
        }
    }

}
