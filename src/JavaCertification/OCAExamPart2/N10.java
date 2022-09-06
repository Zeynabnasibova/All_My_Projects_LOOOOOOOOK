package JavaCertification.OCAExamPart2;

public class N10 {
    public static void main(String[] args) {

        int array [] = { 10, 20, 30, 40, 50};
        int x = array.length;//5 4 3 2 1
//        while (x > 0){
//            System.out.println(array[x--]);//4-40  3-40  2-30  1-20  0-10
//        }

        while (x > 0){
            x--;
            System.out.print(array[x]);
        }

    }

}
