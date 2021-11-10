package codingBatRepeat.Array1;

import java.util.Arrays;

public class Front11 {

    public static void main(String[] args) {

        Front11 obj = new Front11();
int [] a = {1, 2, 3};
int [] b = {4, 5, 6};
        System.out.println(Arrays.toString(obj.front11(a,b)));
    }


    public int[] front11(int[] a, int[] b) {

        if(a.length == 0 && b.length == 0){
            return a;
        }else if(a.length == 0){

            return new int[]  {b[0] };

        }else if(b.length == 0){

            return new  int [] {a[0]};

        }else{

            return new  int []{a[0],b[ 0]};
        }



    }


}
