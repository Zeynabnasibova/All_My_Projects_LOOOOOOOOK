package OCAIZO_808;

public class N3 {
    public static void main(String[] args) {
        int num [] [] = new int [1][3];
//        num[0][0] = 9;
//        num[0][1] = 8;
//        num[0][2] = 7;
//        num[1][0] = 3;
//        num[1][1] = 1;
        //num[1][2] = 2;

        for(int i = 0; i < num.length;i++){
            for(int j = 0; j < num[i].length; j++){
                num[i][j] = 10;
            }
        }
//        System.out.println(Arrays.toString(num[0]));
//        System.out.println(Arrays.toString(num[1]));
        System.out.println(num.length);
    }
}
