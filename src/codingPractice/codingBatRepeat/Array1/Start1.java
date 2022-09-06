package codingPractice.codingBatRepeat.Array1;

public class Start1 {

    public static void main(String [] args){

        Start1 obj = new Start1();
        int [] a = {1, 2, 3};
        int [] b = {4, 5, 1};
        System.out.println(obj.start1(a, b));



    }

    public int start1(int[] a, int[] b) {

        if(a.length ==0 && b.length == 0){

            return 0;

        }else if(a.length > 0 && b.length > 0 && a[0] == 1 && b[0] == 1){

            return 2;


        }else if(a.length == 0 && b[0]==1 || b.length == 0 && a[0] == 1){

            return 1;

        }else{

            return 0;
        }

    }

}
