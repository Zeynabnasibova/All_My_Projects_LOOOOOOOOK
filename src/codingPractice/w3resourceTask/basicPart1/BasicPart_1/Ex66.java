package codingPractice.w3resourceTask.basicPart1.BasicPart_1;

public class Ex66 {
    /*
    66. Write a Java program to compute the sum of the first 100 prime numbers. Go to the editor
Sample Output:

Sum of the prime numbers till 100: 1060
     */
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2; i <= 100; i++){
            int count = 0;
          for(int j = 2; j <= 100; j++){
              if(i % j == 0){
                  count++;
              }
          }
          if (count == 1){
              sum += i;
              System.out.println(i);
          }
        }
        System.out.println(sum);
    }
}
