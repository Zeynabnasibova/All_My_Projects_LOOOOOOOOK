package codingBatVoidWithoutStatic.string1;

public class MakeOutWord {


    public static void main(String[] args) {

        MakeOutWord obj = new MakeOutWord();

        obj.makeOutWord("<<>>","Yay");
    }





    public void makeOutWord(String out, String word) {
        word = out.substring(0,2) + word + out.substring(2,4);

        System.out.println(word);
    }

}
