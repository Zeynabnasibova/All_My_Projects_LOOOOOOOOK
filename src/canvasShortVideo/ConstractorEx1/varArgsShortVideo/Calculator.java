package canvasShortVideo.ConstractorEx1.varArgsShortVideo;

public class Calculator {

    public void printAllArrayNumbers(int [] numbers){

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


    public void printAllNumbers(int... numbers){

        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }


}
