package mart.codingbatTask.warmup1.mart2;

public class FrontBack {
    /*

Given a string, return a new string where the first and last chars have been exchanged.

frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
     */
    public String frontBack(String str) {
        if(str.length() < 2 || str.length()==0){
            return str;
        }else{

        String newStr = str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
        return newStr;
    }}
public static void main(String [] args) {
    FrontBack obj = new FrontBack();
    System.out.println(obj.frontBack("code"));
}
}
