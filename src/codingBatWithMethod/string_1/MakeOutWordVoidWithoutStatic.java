package codingBatWithMethod.string_1;

public class MakeOutWordVoidWithoutStatic {


    public void makeOutWord(String out, String word) {

        String newWord = out.substring(0, 2) + word + out.substring(2, 4);

        System.out.println(newWord);

    }


    public static void main(String[] args) {

MakeOutWordWithoutStatic newWord = new MakeOutWordWithoutStatic();

newWord.makeOutWord("<<>>", "Yay");

        System.out.println(newWord.makeOutWord("<<>>", "Yay"));
    }
}