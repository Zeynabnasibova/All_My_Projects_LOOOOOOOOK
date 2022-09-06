package codingPractice.codingBatRepeat.Warmup1;

public class StringE {

    public static void main(String[] args) {

        StringE obj = new StringE();
        String str = "Hello";
        System.out.println(obj.stringE(str));
    }

    public boolean stringE(String str) {

        int count = 0;

        for(int i = 0; i < str.length(); i++){

            if(str.charAt(i) == 'e'){

                count++;
            }
        }

        if(count <= 3 && count >=1){

            return true;
        }else{
            return false;
        }

    }
}