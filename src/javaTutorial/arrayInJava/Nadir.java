package javaTutorial.arrayInJava;

public class Nadir {

    public static void main(String[] args) {

        System.out.println(lastThree("SoftSkill"));

    }

    public static  boolean lastThree(String str){

        String lastThree = str.substring(str.length()-3);

            if(lastThree.equals("ill")){

                return true;

            } else {

                return false;
        }
    }
}
