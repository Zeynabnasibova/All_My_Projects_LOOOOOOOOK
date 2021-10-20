package NadirInterviewQuestion;

public class interv3 {


    public static void main(String[] args) {

        System.out.println(Ends("og", "og"));
    }

        /*
        write metod return true or false
        parameter two string
        chek if chek long than 3 character and return tru if end of 2 xarakter same

      return true if ending of the last 2 charakter same

      false if length is less than 3
         */

        public static boolean Ends(String str1,String str2){

            String str1last2 = str1.substring(str1.length()-2);
            String str2last2 = str2.substring((str2.length()-2));

            if(str1.length() < 3 && str2.length() < 3) {

                return false;

            }else if(str1last2.equals(str2last2)){

              return true;

            }else{

              return false;
          }

        }


}
