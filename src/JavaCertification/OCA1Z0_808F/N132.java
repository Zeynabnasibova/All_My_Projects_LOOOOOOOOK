package JavaCertification.OCA1Z0_808F;

public class N132 {

    public static void main(String[] args) {

        int [] [] arr = new int [2] [4];
        arr[0] = new int [] {1,3,5,7};
        arr[1] = new int [] {1,3};

        for(int [] a : arr){
            for(int i : a){
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}
