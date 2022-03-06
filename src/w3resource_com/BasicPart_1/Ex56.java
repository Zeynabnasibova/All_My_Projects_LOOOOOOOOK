package w3resource_com.BasicPart_1;

public class Ex56 {
    /*
    56. Write a Java program to find the number of values in a given range divisible by a given value. Go to the editor
For example x = 5, y=20 and p =3, find the number of integers within the range x..y and that are divisible by p i.e. { i :x ≤ i ≤ y, i mod p = 0 }
Sample Output:
5
     */
    public static void main(String[] args) {
        int x = 5;
        int y = 20;
        int p = 3;
        int count = 0;
        for(int i = 5; i <= 20; i++ ){
            if (i % p == 0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println(count + " numbers are divisible by " + p);
    }
}
