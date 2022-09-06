package JavaCertification.OCAExamPart2;

public class N32 {
    static boolean isAvailable = false;

    public static void main(String[] args) {
        System.out.println(isAvailable + " ");

        isAvailable = dostuff();
        System.out.println(isAvailable);
    }
    public static boolean dostuff(){

        return !isAvailable;
    }
}
