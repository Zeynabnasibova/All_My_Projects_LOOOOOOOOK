package codingPractice.codingBatVoidWithoutStatic.string1;

public class LastChars {

    public static void main(String[] args) {

       LastChars obj = new LastChars();

       obj.lastChars( "last","chars");
    }



    public void lastChars(String a, String b) {
        //a = "yo";b = "java" --> "ya"


        String newAB = "";
        if (a.length() < 1 && b.length() < 1) {
            newAB = "@@";

            System.out.println(newAB);
        } else if (a.length() < 1 && b.length() > 0) {
            newAB = "@" + b.substring(b.length() - 1);

            System.out.println(newAB);
        }else if(a.length() >0 && b.length()<1){

            newAB = a.substring(0, 1) + "@";

            System.out.println(newAB);
        } else {
            newAB = a.charAt(0) + b.substring(b.length()-1);

            System.out.println(newAB);
        }
    }

}
