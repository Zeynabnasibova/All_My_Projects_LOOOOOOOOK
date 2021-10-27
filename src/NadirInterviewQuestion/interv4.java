package NadirInterviewQuestion;

public class interv4 {



/*
take 2 string and return true if strin are any contain another  to string if contains onother
 */


    public static boolean Contain(String str1, String str2){

        if (str1.contains(str2) || str1.equals(str2)) {

            return true;
        }else{
            return false;
        }


    }

    public static void main(String[] args) {

        System.out.println(Contain("Nadir","Nad"));


    }
}
