package practiceAllInterviewCodingTasksSaim;

import java.util.Date;

public class StaticTest {
    public static void main (String [] args){
       // printCurrentTime(); compile time eror - can not call non static method from main
        StaticTest test = new StaticTest();
        test.printCurrentTime();
    }

    public void printCurrentTime(){
        System.out.println(new Date());
    }


}
