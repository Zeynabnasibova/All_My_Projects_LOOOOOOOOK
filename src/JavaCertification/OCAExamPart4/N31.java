package JavaCertification.OCAExamPart4;

import java.util.ArrayList;

public class N31 {

    public static void main(String[] args) {

        ArrayList <String> myList = new ArrayList<>();
        String [] myArray;
//myList.add("k");
//        System.out.println(myList);
        try{
            while(true){
                myList.add("MyString");
            }
        }catch (RuntimeException e){
            System.out.println("Caught a RuntimeException");
        }catch(Exception e){
            System.out.println("Caugh an Exception");
        }
        System.out.println("Ready to use");
    }
}
