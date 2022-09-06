package codingPractice.codingBatRepeat.Warmup1;

public class ParrotTrouble {

    public static void main(String[] args) {

        ParrotTrouble obj = new ParrotTrouble();

        boolean talking = true;
        int hour = 19;
        System.out.println(obj.parrotTrouble(talking,hour));

    }

    public boolean parrotTrouble(boolean talking, int hour) {

        if(talking && (hour < 7 || hour > 20)){

            return true;

        }else{

            return false;
        }



    }

}
