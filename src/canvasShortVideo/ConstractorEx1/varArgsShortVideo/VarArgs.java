package canvasShortVideo.ConstractorEx1.varArgsShortVideo;

public class VarArgs {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        int nums [] = {2, 3, 77};

        c.printAllArrayNumbers(nums);
        c.printAllNumbers(1, 2, 3, 4, 54, 23432, 432, 23432);
        c.printAllNumbers(3, 4, 6, 7);

    }
}
