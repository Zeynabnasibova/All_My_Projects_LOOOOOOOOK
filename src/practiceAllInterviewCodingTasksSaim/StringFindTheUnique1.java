package practiceAllInterviewCodingTasksSaim;

public class StringFindTheUnique1 {

       /* Write a return  method that can find the unique characters from the String

        Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";

        */


    public static String unique(String str){//String str = "AAABBBCCCDEF";
        String unique = "";//"DEF"
        for(int i = 0;i < str.length(); i++){ //D
            int count = 0;
            for(int j = 0; j < str.length(); j++){//AAABBBCCCDEF
             if(str.charAt(i) == str.charAt(j)){
                 count++;
             }

            }
            if(count == 1){
                unique += str.charAt(i);
            }
        }
        return unique;
    }
    public static void main(String[] args) {
String str = "AAABBBCCCDEF";
        System.out.println(unique(str));
    }

}
