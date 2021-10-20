package codingBatVoidWithoutStatic.string1;

public class EndsLy {

    public static void main(String[] args) {

        EndsLy obj = new EndsLy();

        obj.endsLy("oddly");

    }




    public void endsLy(String str) {
        //return str.endsWith("ly");


        if(str.endsWith("ly") ){

            System.out.println(true);

        } else {

            System.out.println(false);

        }
    }

}
