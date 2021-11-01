package replit.string3;

import java.util.Scanner;

public class FindAUser {

    public static void main(String[] args) {

        /*
        Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user to enter full name. Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake", display message: "User found!". Otherwise, display message: "User not found!". Please make your search case insensitive!

Example:

Display message: Enter full name:

input: Max Payne

Display message: User found!
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name");
        String inputName = scan.nextLine();
        String user1 = "Max Payne";
        String user2 = "Alan Wake";

        if(inputName.equalsIgnoreCase(user1) || inputName.equalsIgnoreCase(user2)){

            System.out.println("User found!");

        }else{

            System.out.println("User not found!");
        }

    }
}
