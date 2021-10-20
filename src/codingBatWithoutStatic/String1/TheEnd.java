package codingBatWithoutStatic.String1;

public class TheEnd {

    public static void main(String[] args) {


        TheEnd obj = new TheEnd();

     //   obj.theEnd("Hello",true);
        System.out.println(obj.theEnd("Hello",true));

    }




    public String theEnd(String str, boolean front) {

        if(front){

            return str.substring(0,1);

        }else{

            return str.substring(str.length()-1);

        }

    }
}
