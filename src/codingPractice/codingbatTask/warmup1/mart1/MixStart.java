package codingPractice.codingbatTask.warmup1.mart1;

public class MixStart {
    /*

Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
     */

    public boolean mixStart(String str){
        if(str.length() >=3 && str.substring(1).startsWith("ix")){
            return true;
        }else{
          return  false;
        }
    }
}
