package codingBatWithoutStatic.String1;

public class StartWord {


    public static void main(String[] args) {

        StartWord obj = new StartWord();

        System.out.println(obj.startWord("hippo","hi"));



    }




    public String startWord(String str, String word) {

        if(str.length() >= word.length() && str.substring(1,word.length()).equals(word.substring(1))){

            str = str.substring(0,word.length());

            return str;

        }else{

            return "";
        }
    }

}
