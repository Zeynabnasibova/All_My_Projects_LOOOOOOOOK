package codingPractice.replit_.ooptask.carpetclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carpet c = new Carpet();
        System.out.println(c.totalPrice);

        Carpet c2 = new Carpet(in.nextDouble(), in.nextDouble(), in.nextDouble(), in.nextBoolean());
       System.out.println(c2.totalPrice);

    }
}