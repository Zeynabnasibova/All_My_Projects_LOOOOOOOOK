package codingBatWithMethod.string_1;

public class MakeOutWordWithoutStatic {



    public String makeOutWord(String out, String word) {

        word = out.substring(0,2) + word + out.substring(2,4);

        return word;

    }



    public static void main(String[] args) {

    MakeOutWordWithoutStatic word = new MakeOutWordWithoutStatic();

        System.out.println(word.makeOutWord("<<>>","Yay"));

    }

}
