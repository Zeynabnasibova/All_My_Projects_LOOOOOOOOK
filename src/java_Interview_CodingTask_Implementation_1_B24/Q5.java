package java_Interview_CodingTask_Implementation_1_B24;

public class Q5 {

    /*
    Q5: String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA

     */
    public static void main(String[] args) {

String str = "ABCD";

String reverse = "";

for(int i = str.length()-1; i >= 0; i--){

    reverse += str.charAt(i);

}
        System.out.println(reverse);

    }
}
