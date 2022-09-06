package codingPractice.replit_.method;

public class PrintNext3Numbers {

    public static void main(String[] args) {

        next3(3);
    }



public static void next3(int num){

    int next3 = 0;//6

    System.out.println("next 3 are:");

    for(int i = 1;i < 4; i++){

         next3  = num + i ;//3 + 1=4  //3+ 2 = 5 //3+3 = 6

        System.out.print(next3 + " ");


    }

}

}
/*
Create a method called next3 . This method has an int argument and prints the next 3 numbers after that number. Call the method from main method and pass num to it.

flow:

enter number
1
next 3 are:
2 3 4

(put a space between numbers)
 */