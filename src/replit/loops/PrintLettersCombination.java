package replit.loops;

public class PrintLettersCombination {
    /*
    Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or 'w', or 'v'. The combinations should be displayed in descending alphabetical order:

zz

zy

zx

zw

zv

yz

....

vv
     */

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        String combination = "";
        for(char ch = 'z'; ch >= 'a'; ch--){
            for(char c = 'z'; c >= 'a';c--){
                combination = "" + ch + c;
                System.out.println(combination);
            }

        }


    }
}
