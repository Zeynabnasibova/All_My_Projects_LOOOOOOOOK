package practiceAllInterviewCodingTasksSaim;

public class NumbersSwapNumbers1 {

    /*
Swap two variable' values without using a third variable
 */
    public static void main(String[] args) {


        int a = 7;
        int b = 9;
        a = a + b;
        b = a - b;
        a = a -b;

        System.out.println(a);
        System.out.println(b);
    }
}
