package javaTutorial.oopyoutubeVladlenVojayev.ex10Enum;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(Color.RED.getCode());
        System.out.println(Color.GREEN.getCode());



    }
}

enum Color{
   RED("#ff00000"),
    BLUE("#0000ff"),
    GREEN("#000ff00");
   private String code;
 Color(String inputCode){
       this.code = code;

    }
    public  String getCode(){
     return code;
    }
        }
