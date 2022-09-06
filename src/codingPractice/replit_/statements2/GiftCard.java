package codingPractice.replit_.statements2;

import java.util.Scanner;

public class GiftCard {

    public static void main(String[] args) {
        /*
        Similar to Vending Machine

Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase.

If item is not in the list, display message: "Invalid item!".
If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
List of items Blanket - 60$ Charger - 25$ Hat - 25$ Headphones - 30$ Laptop - 200$ Pants - 50$ Pillow - 40$ Smartphone - 1000$ Socks - 5$ USB cable - 10$
Hint: if/ else if / else or switch statement

Examples:

input: Hat
output:
Thank you for your purchase!
Your current balance is: 75$

input: Pants
output:
Thank you for your purchase!
Your current balance is: 50$

input: Laptop
Output:
Sorry, not enough funds on your gift card!

input: Cupcake
output: Invalid item!
         */
        int balance = 100;
        Scanner input = new Scanner(System.in);
        String item = input.nextLine();
        if(item.equals("Blanket")){
            System.out.println("Thank you for your purchase!");
            balance = balance - 60;
            System.out.println("Your current balance is: " + balance + "$");
        }else if (item.equals("Charger")){
            balance = balance- 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Hat")){
            balance = balance - 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Headphones")){
            balance = balance - 30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Pants")){
            balance = balance - 50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        }else if (item.equals("Pillow")){
            balance = balance - 40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        }else if (item.equals("Socks")){
            balance = balance - 5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        }else if (item.equals("USB cable")){
            balance = balance - 10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + balance + "$");
        }else if(item.equals("Smartphone") || item.equals("Laptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else{
            System.out.println("Invalid item!");
        }
    }
}
