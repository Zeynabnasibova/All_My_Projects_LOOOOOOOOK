package practiceAllInterviewCodingTasksSaim;

public class NumbersFINRA1 {

/*
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */

/* 3. write a program which prints out the numbers from 1 to 30:
1. for numbers which are divisible by 3, print "FIN" instead of the number.
2. for numbers which are divisible by 5, print "RA" instead of the number
3. for numbers which are a divisible by both 3 and 5, print "FINRA"
Ex: 1 2 FIN 4 RA FIN .... FINRA
 */
public static void finRa(){

    String result = "";

  for (int i = 1; i <= 30; i++) {

        if (i % 3 == 0 && i % 5 == 0){ //prints number divisible by both 3 & 5
            // System.out.print(i+"FINRA "); 1.yol
            result += "FINRA "; // concatenation 2.yol
        }else if (i %3 == 0){ // prints number divisible by 3
            // System.out.print(i+ "FIN ");
            result += "FIN "; // concatenation
        }else if ( i %5 == 0){
        // System.out.print(i+"RA ");
            result += "RA "; // concatenation
        }else{
            // System.out.print(i+" ");
            result += i+" "; // concatenation
        }
    }   //1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA
        System.out.println(result);

    }

    public static void main(String[] args) {
 finRa();
    }
}
