package w3resource_com.BasicPart_1;

public class Ex50 {
    /*
    50. Write a Java program to print numbers between 1 to 100 which are divisible by 3, 5 and by both.
Sample Output:

Divided by 3:
3, 6, 9, 12, 15, 18, 21, 24, 27, 30, 33, 36, 39, 42, 45, 48, 51, 54, 57
, 60, 63, 66, 69, 72, 75, 78, 81, 84, 87, 90, 93, 96, 99,

Divided by 5:
5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90,
95,

Divided by 3 & 5:
15, 30, 45, 60, 75, 90,
     */
    public static void main(String[] args) {
        String divBoth = "";
        String div3="";
        String div5="";
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0 && i % 5==0){
                divBoth += i + " ";
            }else if(i % 3 == 0){
                div3+=i + " ";
            }else{
             div5+=i + " ";
            }
        }
        System.out.println("Divided by 3 & 5:  \n" + divBoth);
        System.out.println("Divided by 3: \n" +div3);
        System.out.println("Divided by 5: \n" + div5);
    }
}
