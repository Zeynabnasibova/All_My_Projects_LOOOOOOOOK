package javaTutorial.oopyoutubeVladlenVojayev.ex5final;

public class Main {

    public static void main(String[] args) {

       Hotel preston3 = new Hotel(20);
     Hotel preston4 = new Hotel(30);

        System.out.println(preston3.a);
        preston3.a = 9;
        System.out.println(preston3.a);
        System.out.println(preston4.a);

      //  preston3.star = 5;// it is final we can't chance final Constant , but we can print
        System.out.println(preston3.STAR);

    }

}
