package codingPractice.codingBatWithoutStatic.String1;

public class EndsLy {

    public static void main(String[] args) {

    EndsLy obj = new EndsLy();

        System.out.println(obj.endsLy("oddly"));

    }






    public boolean endsLy(String str) {
        //return str.endsWith("ly");


        if(str.endsWith("ly") ){

            return true;

        } else {

            return false;

        }
    }

}
