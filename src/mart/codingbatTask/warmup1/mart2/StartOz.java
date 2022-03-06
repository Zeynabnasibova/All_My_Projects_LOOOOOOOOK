package mart.codingbatTask.warmup1.mart2;

public class StartOz {
    /*

Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz"
startOz("bzoo") → "z"
startOz("oxx") → "o"
     */
    public String startOz(String str) {
        if(str.length() > 2  && !str.startsWith("o") && str.charAt(1) !='z'){
            return "";
        } else if(str.length() > 2  && str.startsWith("o") && str.charAt(1)=='z'){
            return str.substring(0,2);
        }else if(str.length() > 2 && str.startsWith("o") && str.charAt(1) != 'z'){
            return ""+str.charAt(0);
        }else if(str.length() > 2 && !str.startsWith("o") && str.charAt(1)== 'z'){
            return ""+str.charAt(1);
        }else{
            return str;
        }
    }

}
