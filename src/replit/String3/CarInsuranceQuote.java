package replit.String3;

import java.util.Scanner;

public class CarInsuranceQuote {
    public static void main(String[] args) {
        double premium = 0;
        int accidentsAmount = 0;
        int daysDrivenToWorkOrSchool = 0;
        int milesToWorkOrSchool = 0;
        String vehicleOwnership = "";
        String vehicleUsage = "";
        String continuousInsurance = "";
        String education = "";
        String name = "";
        String referenceNumber = "";
        String driverLicence  = "";
        String driven = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the CountyFarm car insurance!");
        //WRITE YOUR CODE HERE

        System.out.println("Enter your name");
        name = scan.nextLine();
        System.out.println("Do you have a US driver license?");
        driverLicence = scan.nextLine();
        if (driverLicence.equals("No")) {
            System.out.println("Invalid data!");

        } else if (driverLicence.equals("Yes")) {

            System.out.println(" Enter your zip code");
            int zipCode = scan.nextInt();

        if (zipCode == 20910 || zipCode == 20740 ) {

            premium = premium + 60;

        }if(zipCode == 22102 || zipCode == 22103){

            premium = premium + 30;

            }else{

            premium = premium + 50;

            }
            System.out.println("Is this vehicle Owned, Financed, or Leased?");

        if(vehicleOwnership.equals("Owned")){

            premium = premium + 10;

        }else{

            premium = premium + 20;
        }
            System.out.println("How is this vehicle primarily used?");

        if(vehicleUsage.equals("Business")){

            premium = premium + 50;
        }if(vehicleUsage.equals("Pleasure")){

            premium = premium + 10;

            }if(vehicleUsage.equals("Commute")){

            premium = premium + 20;
            }

            System.out.println("Days Driven To Work And/Or School");

        driven = scan.nextLine();

        if(driven.equals("Work") || driven.equals("School")){

            premium = premium + 5;
        }

            System.out.println("Miles Driven To Work And/Or School");

        premium = premium - 1;

            System.out.println("How old are you?");
            int age = scan.nextInt();
            if(age < 16){

                System.out.println("Invalid data!");
            }else if(age > 16 && age < 18){

                premium = premium * 20;

            }else if(age >= 18 && age <= 21  ){

                premium = premium * 6;

            }else if(age > 21 && age < 25){

                premium = premium * 2;

            }

            System.out.println("How many years you've been driving?");

            int drivingexperiens = scan.nextInt();

            if(drivingexperiens > 0 && age * drivingexperiens >= 16){

                premium = premium + 5;
            }else{

                System.out.println( "Invalid data!");
            }

            System.out.println("Have you had any accidents in the last 5 years?");

            String acicidents = scan.nextLine();
            if(acicidents.equals("Yes")){

                System.out.println("How many?");

                
            }
        }
    }
}