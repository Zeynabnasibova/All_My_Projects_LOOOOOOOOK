package codingPractice.SaimPdf_.CollectionPracticepdf;

public class N6 {
    /**
     * Create a method that will accept a String and print out the frequency
     of every character in the String (Use maps, format doesn't need to
     match the output exactly)
     Ex:
     Input: "apple"
     Output: a = 1
     p = 2
     l = 1
     e = 1
     */

    public static String frequency(String str){

        String nonDuplicate = "";

        for(int i = 0; i < str.length(); i ++){

            if(!nonDuplicate.contains("" + str.charAt(i))){

                nonDuplicate += str.charAt(i);

            }
        }


        String result = "";

        for(int i = 0; i < nonDuplicate.length(); i++){
            int count = 0;
            for(int j  = 0; j < str.length(); j++){

                if(nonDuplicate.charAt(i) == str.charAt(j)){

                    count++;
                }
            }

            result += nonDuplicate.charAt(i) + "" + count;
        }
        return result;
    }

    public static void main(String[] args) {


        String str = "apple";

        System.out.println(frequency(str));
    }

}
