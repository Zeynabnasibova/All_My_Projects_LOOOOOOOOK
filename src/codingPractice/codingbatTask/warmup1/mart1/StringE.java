package codingPractice.codingbatTask.warmup1.mart1;

public class StringE {
    /*

Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
     */
    public boolean string(String str){
        int count = 0;
      for(int i = 0; i < str.length(); i++){
          if(str.charAt(i)=='e'){
              count++;
          }
      }
      if(count >= 1 && count <=3){
          return true;
      }else{
          return false;
      }
    }
}
