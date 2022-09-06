package codingPractice.codingBatRepeat.Warmup2;

public class a {



    public int stringMatch(String a, String b) {
        int count = 0;
        for(int i = 0; i < a.length()-1; i++){

            if(a.substring(i,i+2).contains(b.substring(i,i+2))){
                count++;

            }
        }
        return count;

    }

}
