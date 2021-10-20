package codingBatVoidWithoutStatic.string1;

public class StartWord {

    public static void main(String[] args) {

StartWord obj = new StartWord();

obj.startWord("hippo","hi");

    }




    public void startWord(String str, String word) {

        if(str.length() >= word.length() && str.substring(1,word.length()).equals(word.substring(1))){

            str = str.substring(0,word.length());
            System.out.println(str);

        }else{

            System.out.println("");
        }
    }

}
