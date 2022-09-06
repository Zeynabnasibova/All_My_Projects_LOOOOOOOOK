package JavaCertification.OCAExamPart2;

public class N8 {
    public static void main(String[] args) {
        System.out.println("isAvailable(5) = " + isAvailable(5));
        int num = 5;
        while (isAvailable(num)){
            System.out.print(num);
            num--;
        }


    }

    public static boolean isAvailable(int num){
        return num-- > 0 ? true : false;

    }
}
