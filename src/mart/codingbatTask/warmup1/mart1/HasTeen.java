package mart.codingbatTask.warmup1.mart1;

public class HasTeen {
    /*
    We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
     */

    public boolean hastTeen(int a, int b, int c){
        if(Math.abs(a)>= 13 && Math.abs(a) <= 19 || Math.abs(b)>= 13 && Math.abs(b) <= 19 || Math.abs(c)>= 13 && Math.abs(c) <= 19){
            return true;
        }else{
            return false;
        }
    }
}
