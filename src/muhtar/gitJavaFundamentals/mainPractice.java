package muhtar.gitJavaFundamentals;


class CC{
    static int a=10;

}

public class mainPractice {

    public static void main(String[] args) {
        CC.a=40;
        System.out.println("1");
        Object[] arr= {"1","2"};
        Double[] arr2= {1.5, 1.6};
        Character[] arr3= {1,2,3,4};
        main(arr);
        main(arr2);
        main(arr3);


    }
    public static void main(Object[] arr) {
        System.out.println("2");

    }
    public static void main(Double[] arr) {
        System.out.println("3");

    }
    public static void main (Character[] arr) {
        System.out.println("4");
    }

}