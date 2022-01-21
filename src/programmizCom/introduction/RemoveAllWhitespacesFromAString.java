package programmizCom.introduction;

public class RemoveAllWhitespacesFromAString {
    public static void main(String[] args) {

        String str = " This website is awesome." ;
       str = str.trim();
       str = str.replaceAll(" ","");
        System.out.println(str);
    }
}
