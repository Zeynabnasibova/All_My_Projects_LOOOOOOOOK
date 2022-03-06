package mart.w3resourceTask.basicPart1.mart1.array;

public class Reverse {
    public static void main(String [] args){

        String str = "abcd!ef";
        //fedc!ba
        String reversed = "";
        int notLetterpossition = 0;
        String character = "";
        for(int i = 0; i < str.length(); i++){
            if(!Character.isLetter(str.charAt(i))){
                notLetterpossition = str.indexOf(str.charAt(i));
            }
        }
        System.out.println(notLetterpossition);

        for(int i = str.length()-1; i >= 0; i--){
            if(Character.isLetter(str.charAt(i))){
                reversed += str.charAt(i);
            }else{
                character += str.charAt(i);
            }
        }

        System.out.println(reversed);

        String newReversed = reversed.substring(0,notLetterpossition) + character + reversed.substring(notLetterpossition);
        System.out.println(newReversed);
    }
}
