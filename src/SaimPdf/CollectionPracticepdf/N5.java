package SaimPdf.CollectionPracticepdf;

public class N5 {
    /**
     Create a method that will accept a String and return a String that has
     only the unique characters.
     Ex:
     Input: AAABCCCDDEFFS
     Output: BES
     ____________________
     */


    public static String unique (String str ){


        String unique = "";

        for(int i = 0; i < str.length(); i ++){
            int count = 0;
            for(int j = 0; j < str.length(); j++){

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

        String str = "AAABCCCDDEFFS";
        System.out.println(unique(str));
    }
}
