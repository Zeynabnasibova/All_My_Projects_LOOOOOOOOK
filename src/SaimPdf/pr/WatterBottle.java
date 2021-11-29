package SaimPdf.pr;

public class WatterBottle {//Encapsulation
    /*
    Create a class called WaterBottle
- instance variables: brand, ounces

- Create a constructor to initialize the two fields

- Encapsulate the variables

- Bonus: prevent negative ounces to be assigned and null or empty space to be assigned to brand
     */

   private String brand;//instance variable
    private int ounces;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getOunces() {
        return ounces;
    }

    public void setOunces(int ounces) {
        this.ounces = ounces;
    }

    public WatterBottle(String brand, int ounces){

        this.brand = brand;//initialaze
        this.ounces = ounces;




    }

}
