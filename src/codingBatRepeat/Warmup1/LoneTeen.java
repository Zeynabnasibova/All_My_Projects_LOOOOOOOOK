package codingBatRepeat.Warmup1;

public class LoneTeen {


    public static void main(String[] args) {

LoneTeen obj = new LoneTeen();
int a = 8;
int b = 7;
        System.out.println(obj.loneTeen(a,b));


    }


    public boolean loneTeen(int a, int b) {

        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        if(aTeen && !bTeen || bTeen && !aTeen){

            return true;
        }else{
            return false;
        }
    }

}
