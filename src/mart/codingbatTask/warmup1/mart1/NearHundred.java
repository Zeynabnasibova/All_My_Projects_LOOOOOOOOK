package mart.codingbatTask.warmup1.mart1;

public class NearHundred {
    /*

Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.

nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
     */

    public boolean nearHundread(int n ){

        if(Math.abs(100 - n) <= 10 || Math.abs(100 - n) <= 10){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String [] args){
        NearHundred obj = new NearHundred();
        System.out.println(obj.nearHundread(9));
    }
}
