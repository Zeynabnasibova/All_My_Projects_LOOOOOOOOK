package codingBatWithoutStatic.String1;

public class makeOutWord {

    public static void main(String[] args) {

        makeOutWord obj = new makeOutWord();

        System.out.println(obj.makeOutWord("<<>>","Yat"));

    }





    public String makeOutWord(String out, String word) {

        word = out.substring(0,2) + word + out.substring(2,4);

        return word;
    }

}
