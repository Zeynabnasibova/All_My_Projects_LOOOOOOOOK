package codesDope.practiceJava.javaOperators;

public class Q9 {

    public static void main(String[] args) {

        /*
        If the marks of Robert in three subjects are 78,45 and 62 respectively (each out of 100 ), write a program to calculate his total marks and percentage marks.
         */

        int subj1 = 78;
        int subj2 = 45;
        int subj3 = 62;

        int totalMarks = subj1 + subj2 + subj3;

        System.out.println(totalMarks);

        int perMark1 = subj1 * 100 / 100;

        int perMark2 =  subj2 * 100 / 100;

        int perMark3 =subj3 *100 / 100;

        System.out.println("percentage mark of subj1 is: " + perMark1 + "\n" + "percentage mark of subj2 is: " + perMark2 + "\n" + "percentage mark of subj3 is: " + perMark3 );

    }
}
