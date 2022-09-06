package interviewAll;

public class reapeat {



    /*
    -Write me a method that will take 2 string parameters and return how many times second string is in the first string.

    boolean
     */
    static public void main(String[] args) {

        System.out.println(eashyTask("NadirNadirNadir","Nad"));
    }

    public static int eashyTask(String str1, String str2){//
        // STring str1 = "NadirNadirNadir" ;
        // String str2 = "Nad";

        int count = 0;

        for(int i = 0; i < str1.length()-str2.length()+1; i ++){

            if(str1.substring(i,i + str2.length()).equals(str2)){

                count++;

            }

        }

        return count;

    }
}
