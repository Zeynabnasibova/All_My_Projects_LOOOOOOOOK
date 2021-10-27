package NadirInterviewQuestion;

public class interv2 {

    /*
create metod which will acsept two string return str
     */


    public static void main(String[] args) {


        System.out.println(contains("Nadir","Nad"));
    }

    public static boolean contains(String str1,String str2){



        if(str1.contains(str2)){

            return true;

        }else {

            return false;
        }


    }

}
