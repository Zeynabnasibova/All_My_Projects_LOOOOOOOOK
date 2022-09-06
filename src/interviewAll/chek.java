package interviewAll;

public class chek {

    public static void main(String[] args) {


        /*
        -Write me a method that will take 2 string parameters and return how many times second string is in the first string.
         */


        System.out.println(find("NadirNadirNadir","Nad"));
    }

    public static int find(String str1,String str2){
        // String str1 = "NadirNadirNadir" ;
         //String str2 = "Nad";


        int count = 0;

        for(int i = 0; i < str1.length()-2; i ++){

            if(str1.substring(i,i+3).contains("Nad")){

                count++;

            }

        }

        return count;
    }
}
